package nju.software.web.controller;

import nju.software.data.dataobject.PubLctxb;
import nju.software.data.dataobject.PubSlSxzd;
import nju.software.data.dataobject.SfjdDwwt;
import nju.software.service.LCSPService;
import nju.software.service.LctxService;
import nju.software.service.SXZDService;
import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;


import nju.software.service.LiAnService;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@ControllerAdvice(annotations = RestControllerAdvice.class)
public class LiAnController {
    private static Logger logger = Logger.getLogger(LiAnController.class);
    //@Autowired
    @Resource
    private LiAnService liAnService;
    //@Autowired
    @Resource
    private SXZDService sxzdService;
    //@Autowired
    @Resource
    private LctxService lctxService;
    //@Autowired
    @Resource
    private LCSPService lcspService;
    /**
     * ��ת����������
     */
    @RequestMapping("/showLian")
    public String showLiAn(Integer id,Model model) {
        SfjdDwwt sfjdDwwt = liAnService.queryById(id);
        model.addAttribute("auction", sfjdDwwt);
        return "lian";
    }
    /**
     * ��������
     */
    @RequestMapping("lian.do")
    public String liAn(SfjdDwwt sfjdDwwt,Model model) {
        liAnService.liAn(sfjdDwwt);
        //int xlh=sfjdDwwt.getXlh();
        //���޿۳�
        PubSlSxzd sxzd=new PubSlSxzd();
        sxzd.setAjxh(sfjdDwwt.getXlh());
        sxzd.setZdyy("sfpm");  //�ж�ԭ���޸� SxzdDao��getSxzdByAjxhAndZdyyҲҪ�޸�
        sxzd.setZdrq(sfjdDwwt.getSprq());
        sxzd.setCzr("ϵͳ����Ա");
        sxzd.setBz("˾����������ǿ�ƿ۳�");
        sxzd.setZdcljg("Y");
        sxzdService.insertSxzd(sxzd);
        //  ��������
        lcspService.updateLCSP(new Integer(sfjdDwwt.getXlh()),new java.sql.Date(sfjdDwwt.getSprq().getTime()));
        //��������
        PubLctxb lctx=new PubLctxb();
        lctx.setLctxbh(0);//�������ѱ��
        lctx.setLcdmbh("˾���������޿۳�");
        lctx.setAjxh(sxzd.getAjxh());
        lctx.setBh(1);
        lctx.setLctxnr("˾���������޿۳�");
        lctx.setSfcl("Y");
        lctx.setSqrq(sfjdDwwt.getSprq());
        lctxService.AddLctx(lctx);
        return "redirect:/main.do";
    }
    /**
     * �˰�����
     */
    @RequestMapping("tuian.do")
    public String tuiAn(SfjdDwwt sfjdDwwt) {
        liAnService.tuiAn(sfjdDwwt);
        return "redirect:/main.do";
    }
    
    /**
     * ��ת���½�ҳ��
     */
    @RequestMapping("/addNewCase")
    public String showAddNew() {
        return "addNewCase";
    }
    /**
     * �½�����
     */
    @RequestMapping("/addNewCase.do")
    public String saveLiAn(SfjdDwwt sfjdDwwt,Model model) {
        sfjdDwwt.setSfla("��");
        sfjdDwwt.setSfja("��");
        liAnService.save(sfjdDwwt);
        return "redirect:/main.do";
    }
    /**
     * ɾ������
     */
    @RequestMapping("/deleteCase.do")
    public String deleteCase(Integer id) {
        liAnService.delete(id);
        return "redirect:/main.do";
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {

        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));

    }
    
    
}

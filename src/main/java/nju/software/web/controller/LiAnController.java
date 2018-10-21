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
     * 跳转到立案界面
     */
    @RequestMapping("/showLian")
    public String showLiAn(Integer id,Model model) {
        SfjdDwwt sfjdDwwt = liAnService.queryById(id);
        model.addAttribute("auction", sfjdDwwt);
        return "lian";
    }
    /**
     * 立案操作
     */
    @RequestMapping("lian.do")
    public String liAn(SfjdDwwt sfjdDwwt,Model model) {
        liAnService.liAn(sfjdDwwt);
        //int xlh=sfjdDwwt.getXlh();
        //审限扣除
        PubSlSxzd sxzd=new PubSlSxzd();
        sxzd.setAjxh(sfjdDwwt.getXlh());
        sxzd.setZdyy("sfpm");  //中断原因修改 SxzdDao中getSxzdByAjxhAndZdyy也要修改
        sxzd.setZdrq(sfjdDwwt.getSprq());
        sxzd.setCzr("系统管理员");
        sxzd.setBz("司法拍卖审限强制扣除");
        sxzd.setZdcljg("Y");
        sxzdService.insertSxzd(sxzd);
        //  流程审批
        lcspService.updateLCSP(new Integer(sfjdDwwt.getXlh()),new java.sql.Date(sfjdDwwt.getSprq().getTime()));
        //流程提醒
        PubLctxb lctx=new PubLctxb();
        lctx.setLctxbh(0);//流程提醒编号
        lctx.setLcdmbh("司法拍卖审限扣除");
        lctx.setAjxh(sxzd.getAjxh());
        lctx.setBh(1);
        lctx.setLctxnr("司法拍卖审限扣除");
        lctx.setSfcl("Y");
        lctx.setSqrq(sfjdDwwt.getSprq());
        lctxService.AddLctx(lctx);
        return "redirect:/main.do";
    }
    /**
     * 退案操作
     */
    @RequestMapping("tuian.do")
    public String tuiAn(SfjdDwwt sfjdDwwt) {
        liAnService.tuiAn(sfjdDwwt);
        return "redirect:/main.do";
    }
    
    /**
     * 跳转到新建页面
     */
    @RequestMapping("/addNewCase")
    public String showAddNew() {
        return "addNewCase";
    }
    /**
     * 新建操作
     */
    @RequestMapping("/addNewCase.do")
    public String saveLiAn(SfjdDwwt sfjdDwwt,Model model) {
        sfjdDwwt.setSfla("否");
        sfjdDwwt.setSfja("否");
        liAnService.save(sfjdDwwt);
        return "redirect:/main.do";
    }
    /**
     * 删除操作
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

package nju.software.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import nju.software.data.dataobject.PubSlSxzd;
import nju.software.data.dataobject.SfjdDwwt;
import nju.software.service.SXZDService;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;



import nju.software.service.MainService;

import javax.annotation.Resource;

@Controller
@ControllerAdvice(annotations = RestControllerAdvice.class)
public class MainController {
    private static Logger logger = Logger.getLogger(MainController.class);
    //@Autowired
    @Resource
    private MainService mainService;
    //@Autowired
    @Resource
    private SXZDService sxzdService;
    /**
     * 展示数据到主页面
     */
    @RequestMapping("/main.do")
    public String queryAll(Model model) {


        List<SfjdDwwt> auctionList = mainService.queryAll();
        //  总案件个数
        int totalCount= auctionList.size();
        //  已立案个数
        int liAnCount = 0;
        //  已结案个数
        int jieAnCount=0;
        //  统计已立案和已结案的个数
//        for(int i=0;i<auctionList.size();i++) {
////            if(auctionList.get(i).getSfla()!=null &&auctionList.get(i).getSfla().equals("是")) {
////                liAnCount++;
////            }
////
////            if(auctionList.get(i).getSfja()!=null &&auctionList.get(i).getSfja().equals("是")) {
////                jieAnCount++;
////            }
////        }
        for (SfjdDwwt anAuctionList : auctionList) {
            if (anAuctionList.getSfla() != null && anAuctionList.getSfla().equals("是")) {
                liAnCount++;
            }

            if (anAuctionList.getSfja() != null && anAuctionList.getSfja().equals("是")) {
                jieAnCount++;
            }
        }
        model.addAttribute("totalCount", totalCount);
        model.addAttribute("liAnCount", liAnCount);
        model.addAttribute("jieAnCount", jieAnCount);
        model.addAttribute("auctionList", auctionList);
        return "main";
    }
    /**
     * 返回到主页
     */
    @RequestMapping("/main")
    public String showMain() {
        return "redirect:/main.do";
    }
    
    /**
     * 保存更新
     */
    @RequestMapping("/save.do")
    public String saveCase(SfjdDwwt sfjdDwwt) {
        if(sfjdDwwt.getSfja().equals("是")){
            PubSlSxzd sxzd=sxzdService.getSxzdOfSfpm(sfjdDwwt.getXlh());
            if(sxzd!=null){
                sxzd.setHfrq(sfjdDwwt.getJarq());
                sxzd.setZdcljg("Y");
                sxzdService.updateSxzd(sxzd);
            }
        }
        mainService.save(sfjdDwwt);

        return "redirect:/main.do";
    }


/*
    ajax接收查询项 暂存查询条件
 */
    @RequestMapping(value = "/search.do",method = RequestMethod.POST)
    @ResponseBody
    public List<SfjdDwwt> search(@RequestBody List<Map<String,String>> listMap){

        ArrayList<String> select1List=new ArrayList<String>();//存放查询选项
        ArrayList<String> input2List=new ArrayList<String>();//存放输入项
        ArrayList<String> select2List=new ArrayList<String>();//存放 且/或
        for(Map<String,String>m:listMap){
            for (String k : m.keySet()){
                if(k.equals("select1")){ select1List.add(m.get(k));}
                else if(k.equals("input2")){ input2List.add(m.get(k));}
                else if(k.equals("select2")){ select2List.add(m.get(k));}
               // System.out.println(k + " : " + m.get(k));
            }
        }
        List<SfjdDwwt> auctionList = mainService.search(select1List,input2List,select2List);

        //model.addAttribute("auctionList", auctionList);
        return auctionList;

    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {

        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));

    }


    
}

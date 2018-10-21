package nju.software.web.controller;

import nju.software.data.dataobject.SfjdDwwt;
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
public class JieAnController {
    private static Logger logger = Logger.getLogger(JieAnController.class);
    //@Autowired
    @Resource
    private LiAnService liAnService;
    /**
     * 跳转到结案界面
     */
    @RequestMapping("/showJiean")
    public String showJieAn(Integer id,Model model) {
        SfjdDwwt sfjdDwwt = liAnService.queryById(id);
        model.addAttribute("auction", sfjdDwwt);
        return "jiean";
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {

        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));

    }
}

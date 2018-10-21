package nju.software.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import nju.software.data.dataobject.UserForm;
import nju.software.service.UserService;

@Controller
public class LoginController {
    private static Logger logger = Logger.getLogger(LoginController.class);
    // 将服务依赖注入到属性userService
    //@Autowired
    @Resource
    public UserService userService;

    @RequestMapping("/login")
    public String login() {
        /*
         * 不管重定向或转发，都需要符合视图解析器的配置，如果直接跳转到一个不需要dispatcher servlet的资源，
         * 需要使用mvc:resources配置， 如：<mvc:resources location="/html/"
         * mapping="/html/**"></mvc:resources> ） return "forward:/html/my.html";
         */
        // 转发到一个请求方法（同一个控制器类里，可省略/index/）
        // return "forward:/index/isLogin";
        return "login";
    }

    @RequestMapping("/login.do")
    public String mainPage(UserForm user, HttpSession session, Model model) {
        if(userService.login(user)){
            session.setAttribute("u", user.getUsername());
            return "redirect:/main.do";//登录成功，跳转到main.jsp
        }else{
            return "login";
        }   
    }

}

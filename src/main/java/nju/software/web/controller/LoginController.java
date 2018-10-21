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
    // ����������ע�뵽����userService
    //@Autowired
    @Resource
    public UserService userService;

    @RequestMapping("/login")
    public String login() {
        /*
         * �����ض����ת��������Ҫ������ͼ�����������ã����ֱ����ת��һ������Ҫdispatcher servlet����Դ��
         * ��Ҫʹ��mvc:resources���ã� �磺<mvc:resources location="/html/"
         * mapping="/html/**"></mvc:resources> �� return "forward:/html/my.html";
         */
        // ת����һ�����󷽷���ͬһ�������������ʡ��/index/��
        // return "forward:/index/isLogin";
        return "login";
    }

    @RequestMapping("/login.do")
    public String mainPage(UserForm user, HttpSession session, Model model) {
        if(userService.login(user)){
            session.setAttribute("u", user.getUsername());
            return "redirect:/main.do";//��¼�ɹ�����ת��main.jsp
        }else{
            return "login";
        }   
    }

}

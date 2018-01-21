package FullBloom.controller;

import FullBloom.pojo.Msg;
import FullBloom.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by 759517209@qq.com on 2017/9/8.
 */
@Controller
@RequestMapping(value = "/api")
public class LoginController {

    @Resource
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Msg login(String nickname, String password, HttpSession session){
        boolean result = loginService.verify(nickname, password);
        if(result){
            session.setAttribute("nickname", nickname);
            return Msg.success("登陆成功").add("status", 0);
        }else{
            return Msg.success("登录失败 ").add("status", 1);
        }
    }
}

package FullBloom.controller;

import FullBloom.pojo.Msg;
import FullBloom.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 759517209@qq.com on 2017/9/10.
 */
@Controller
@RequestMapping("/api")
public class RegisterController {

    @Resource
    RegisterService registerService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Msg register(String nickname, String password, HttpSession session){
        if (isExist(nickname)){
            return Msg.success("用户名存在 ").add("status", 1);
        } else if (!isStandardUsername(nickname)){
            return Msg.success("用户名格式错误 ").add("status", 1);
        }else if (!isStandardPassword(password)){
            return Msg.success("密码格式错误 ").add("status", 1);
        }else{
            if (registerService.register(nickname, password)){
                session.setAttribute("nickname", nickname);
                return Msg.success("注册成功 ").add("status", 0);
            }else{
                return Msg.fail("服务器错误 ");
            }
        }
    }

    public boolean isExist(String nickname){
        return registerService.isExist(nickname);
    }

    public boolean isStandardUsername(String username){
        Pattern p = Pattern.compile("[A-Za-z0-9]{6,16}");
        Matcher m = p.matcher(username);
        return m.matches();
    }

    public boolean isStandardPassword(String password){
        Pattern p = Pattern.compile("\\w{6,16}");
        Matcher m = p.matcher(password);
        return m.matches();
    }
}

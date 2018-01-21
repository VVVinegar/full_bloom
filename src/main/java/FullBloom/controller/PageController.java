package FullBloom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by 759517209@qq.com on 2017/9/10.
 */
@Controller
//@RequestMapping("")
public class PageController {

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/register")
    public String register(){
        return "register";
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String detail(Integer partyID, ModelMap model){
        model.addAttribute("partyID", partyID);
        return "/detail";
    }

}

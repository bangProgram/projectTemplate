package com.tvod_test.test_dev.rest.controller.webController;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class webMvcController {

    @GetMapping(value = "/home")
    public String goHome(HttpServletRequest request){
        return "main/home/home";
    }

    @GetMapping(value = "/admin")
    public String goAdmin(HttpServletRequest request){
        return "main/admin/list";
    }

    @GetMapping(value = "/login")
    public String goLogin(HttpServletRequest request){
        return "main/login/login";
    }

    @GetMapping(value = "/member")
    public String goMember(HttpServletRequest request){
        return "main/member/list";
    }
}

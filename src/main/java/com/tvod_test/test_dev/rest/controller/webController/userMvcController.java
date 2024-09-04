package com.tvod_test.test_dev.rest.controller.webController;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class userMvcController {

//    @GetMapping(value = "/user/*/*")
//    public String goTest(HttpServletRequest request, Model model) {
//        String path = request.getServletPath();
//        log.info("JB Path info : {}",path);
//        return path+"/index";
//    }


/*

    @GetMapping(value = "/home")
    public String goHome(HttpServletRequest request){
        return "main/home/home";
    }

    @GetMapping(value = "/login")
    public String goLogin(HttpServletRequest request, Model model){
        return "main/login/login";
    }

    @GetMapping(value = "/signup")
    public String goSignup(HttpServletRequest request, Model model){
        model.addAttribute("outputText", "");
        return "main/signup/login";
    }

    @GetMapping(value = "/detail")
    public String goMember(HttpServletRequest request){
        return "main/member/list";
    }*/
}

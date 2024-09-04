package com.tvod_test.test_dev.rest.controller.webController.user;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class AuthController extends DefaultController {

    @GetMapping("/auth/login")
    public String goLogin(HttpServletRequest request, Model model) {
        return "/user/auth/login/index";
    }
}

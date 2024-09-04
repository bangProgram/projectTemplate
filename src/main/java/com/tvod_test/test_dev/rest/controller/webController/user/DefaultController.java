package com.tvod_test.test_dev.rest.controller.webController.user;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
public class DefaultController {

    @GetMapping("/common")
    public String getCommon(HttpServletRequest request, Model model) {
        return "index";
    }
}

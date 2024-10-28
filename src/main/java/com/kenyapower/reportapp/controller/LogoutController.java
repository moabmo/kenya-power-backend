package com.kenyapower.reportapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {

    @GetMapping("/logout")
    public String logout() {
        return "redirect:http://localhost:8180/realms/kenya-power/protocol/openid-connect/logout?redirect_uri=http://localhost:8080";
    }
}

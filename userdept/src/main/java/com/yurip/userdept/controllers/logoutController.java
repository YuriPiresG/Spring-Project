package com.yurip.userdept.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class logoutController {

    @GetMapping("/cya")
   public String logoutPage(Model model){
    model.addAttribute("message", "Cya");
    return "logout";
   }
}
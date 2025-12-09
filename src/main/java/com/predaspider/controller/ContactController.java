package com.predaspider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

    @GetMapping("/lien-he")
    public String home() {
        return "contact/contact";
    }
}

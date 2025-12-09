package com.predaspider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    
    @GetMapping("/san-pham")
    public String home() {
        return "product/product";
    }
}
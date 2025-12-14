package com.predaspider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // 1. HOME
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // 2. FEATURES PAGE
    @GetMapping("/features")
    public String features() {
        return "features";
    }

    // 3. HOW IT WORKS / GUIDE
    @GetMapping("/guide")
    public String guide() {
        return "guide";
    }

    // 4. PRICING
    @GetMapping("/pricing")
    public String pricing() {
        return "pricing";
    }

    // 5. DOWNLOAD
    @GetMapping("/download")
    public String download() {
        return "download";
    }

    // 6. DOCUMENTATION
    @GetMapping("/docs")
    public String documentation() {
        return "docs";
    }

    // 7. FAQ
    @GetMapping("/faq")
    public String faq() {
        return "faq";
    }

    // 8. SUPPORT / CONTACT
    @GetMapping("/support")
    public String support() {
        return "support";
    }

    // 9. CHANGELOG / UPDATES
    @GetMapping("/changelog")
    public String changelog() {
        return "changelog";
    }

    // 10. BLOG / TUTORIALS
    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

    //11. TERMS
    @GetMapping("/terms")
    public String term(){
        return "terms";
    }
}

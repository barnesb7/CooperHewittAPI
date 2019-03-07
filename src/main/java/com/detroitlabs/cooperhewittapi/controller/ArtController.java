package com.detroitlabs.cooperhewittapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArtController {

    @RequestMapping("/")
    public String displayHome(){
        return "index";
    }
}

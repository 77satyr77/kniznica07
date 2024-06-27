package org.example.kniznica07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {

    @GetMapping
    public String nacitajIndex(){
        return "index";
    }
}

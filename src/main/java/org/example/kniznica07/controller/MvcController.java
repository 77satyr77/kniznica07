package org.example.kniznica07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MvcController {

    @GetMapping
    public String nacitajPrihlasovaciuObrazovku(){
        return "index";
    }
}

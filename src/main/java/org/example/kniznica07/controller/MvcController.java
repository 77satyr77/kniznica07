package org.example.kniznica07.controller;

import org.example.kniznica07.service.UzivatelServis;
import org.example.kniznica07.service.implementation.UzivatelServisImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MvcController {

    private final UzivatelServis uzivatelServis;

    public MvcController(UzivatelServis uzivatelServis) {
        this.uzivatelServis = uzivatelServis;
    }

    @GetMapping
    public String nacitajPrihlasovaciuObrazovku(){
        return "index";
    }

    @PostMapping
    public String pridajUzivatela(@RequestParam String meno,@RequestParam String heslo){
        uzivatelServis.novyUzivatel(meno,heslo);
        return "index";
    }
}

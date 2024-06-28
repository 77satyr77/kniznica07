package org.example.kniznica07.service;

import org.example.kniznica07.model.Uzivatel;
import org.springframework.stereotype.Service;

@Service
public interface UzivatelServis {
    public void novyUzivatel(String meno, String heslo);
}

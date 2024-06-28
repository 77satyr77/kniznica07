package org.example.kniznica07.service.implementation;

import org.example.kniznica07.model.Uzivatel;
import org.example.kniznica07.repository.UzivatelRepository;
import org.example.kniznica07.service.UzivatelServis;
import org.springframework.stereotype.Service;


@Service
public class UzivatelServisImpl implements UzivatelServis {

    private final UzivatelRepository uzivatelRepository;

    public UzivatelServisImpl(UzivatelRepository uzivatelRepository) {
        this.uzivatelRepository = uzivatelRepository;
    }


    @Override
    public void novyUzivatel(String meno, String heslo) {
        Uzivatel novyUzivatel = Uzivatel.builder()
                .meno_uzivatel(meno)
                .heslo_uzivatel(heslo)
                .build();
        uzivatelRepository.save(novyUzivatel);

    }
}

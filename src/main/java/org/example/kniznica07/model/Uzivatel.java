package org.example.kniznica07.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Uzivatel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id_uzivatel;

    //@Column(name = "meno_uzivatel")
    private String meno_uzivatel;

    //@Column(name = "heslo_uzivatel")
    private String heslo_uzivatel;

    //@Column(name = "email_uzivatel")
    private String email_uzivatel;

    //@Column(name = "je_admin")
    private boolean je_admin;
}




CREATE TABLE IF NOT EXISTS uzivatel(
                         id_uzivatel INT PRIMARY KEY AUTO_INCREMENT,
                         meno_uzivatel VARCHAR(45) NOT NULL ,
                         heslo_uzivatel VARCHAR(15) not null ,
                         email_uzivatel VARCHAR(25),
                         je_admin BOOLEAN DEFAULT FALSE);
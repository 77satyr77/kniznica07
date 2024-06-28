package org.example.kniznica07;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Kniznica07Application {

    public static void main(String[] args) {
        SpringApplication.run(Kniznica07Application.class, args);

        log.info("http://localhost:8081/");
    }

}

package com.soriano.patterns;

import com.soriano.patterns.domains.factorymethod.FactoryMethodMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternsApplication.class, args);
        FactoryMethodMain.run();
    }

}

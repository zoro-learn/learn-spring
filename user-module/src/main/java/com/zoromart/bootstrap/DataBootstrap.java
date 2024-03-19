package com.zoromart.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBootstrap implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        System.out.println("checking the working of command line !!!");

    }
}

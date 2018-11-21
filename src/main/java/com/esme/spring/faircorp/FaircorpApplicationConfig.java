package com.esme.spring.faircorp;

import com.esme.spring.faircorp.hello.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FaircorpApplicationConfig {

    @Autowired
    private GreetingService greetingservice;


    @Bean
    public CommandLineRunner greetingCommandLine() {

        greetingservice.greet("Test");
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

            }
        };
    }
}

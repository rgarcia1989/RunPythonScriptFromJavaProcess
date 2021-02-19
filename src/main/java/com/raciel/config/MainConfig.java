package com.raciel.config;

import com.raciel.services.PythonCreateFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.raciel.*"})
public class MainConfig {

    public static void main(String[] args) {
        SpringApplication.run(MainConfig.class, args);
    }

    @Bean
    public CommandLineRunner test(PythonCreateFileService createFileService) {
        return (args) -> {
            System.out.println(createFileService.createNewFile());
        };
    }
}


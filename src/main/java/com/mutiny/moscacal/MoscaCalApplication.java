package com.mutiny.moscacal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class MoscaCalApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MoscaCalApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MoscaCalApplication.class);
    }
}

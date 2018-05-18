package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringbootJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJwtApplication.class, args);
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // rejestracja
    // http://localhost:8080/users/sign-up
    //{
    //	"username":"user",
    //	"password": "1234"
    //}

    // logowanie
    // http://localhost:8080/login
    //{
    //	"username":"user",
    //	"password": "1234"
    //}
}

package com.sid.videocallapp;

import com.sid.videocallapp.user.User;
import com.sid.videocallapp.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallappApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideocallappApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserService userService){
        return args -> {
            userService.register(User.builder().username("othmane1").email("othmane1@gmail.com").password("12345").build());
            userService.register(User.builder().username("othmane2").email("othmane2@gmail.com").password("12345").build());
            userService.register(User.builder().username("othmane3").email("othmane3@gmail.com").password("12345").build());

            System.out.println();
        };
    }
}

package com.example.springdatajpa2.post;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostRepositoryTestConfig {

//    @Bean
//    public PostListener postListener() {
//        return new PostListener();
//    }

//    @Bean
//    public ApplicationListener<PostPublishedEvent> postListener() {
//        return new ApplicationListener<PostPublishedEvent>() {
//            @Override
//            public void onApplicationEvent(PostPublishedEvent event) {
//                System.out.println("=======================");
//                System.out.println(event.getPost() + " is published");
//                System.out.println("=======================");
//            }
//        };
//    }

    @Bean
    public ApplicationListener<PostPublishedEvent> postListener() {
        return event -> {
            System.out.println("=======================");
            System.out.println(event.getPost() + " is published");
            System.out.println("=======================");
        };
    }
}

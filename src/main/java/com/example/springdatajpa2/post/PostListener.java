package com.example.springdatajpa2.post;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;

public class PostListener { //implements ApplicationListener<PostPublishedEvent> {

    //@Override
    @EventListener
    public void onApplicationEvent(PostPublishedEvent event) {
        System.out.println("=======================");
        System.out.println(event.getPost() + " is published");
        System.out.println("=======================");

    }
}

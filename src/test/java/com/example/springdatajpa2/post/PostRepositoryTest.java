package com.example.springdatajpa2.post;

import com.querydsl.core.types.Predicate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({SpringExtension.class})
@DataJpaTest
@Import({PostRepositoryTestConfig.class})
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

//    @Autowired
//    ApplicationContext applicationContext;
//
//    @Test
//    public void event() {
//        Post post = new Post();
//        post.setTitle("event");
//        PostPublishedEvent event = new PostPublishedEvent(post);
//        applicationContext.publishEvent(event);
//    }

    @Test
    public void crud() {

        Post post = new Post();
        post.setTitle("hibernate");

//        assertThat(postRepository.contains(post)).isFalse();

//        postRepository.save(post);

        postRepository.save(post.publish());

        Predicate predicate = QPost.post.title.containsIgnoreCase("Hi");
        Optional<Post> one = postRepository.findOne(predicate);
        assertThat(one).isNotEmpty();

//        assertThat(postRepository.contains(post)).isTrue();

//        postRepository.delete(post);
//        postRepository.flush();
//        postRepository.findMyPost();

//        Post post = new Post();
//        post.setTitle("hibernate");
//        postRepository.save(post);
//
//        postRepository.findMyPost();
//
//        postRepository.delete(post);
//        postRepository.flush();
    }

}
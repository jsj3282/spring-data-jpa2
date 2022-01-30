package com.example.springdatajpa2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryImplementationPostfix = "Impl", repositoryBaseClass = SimpleMyRepository.class)
public class SpringDataJpa2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpa2Application.class, args);
    }

}

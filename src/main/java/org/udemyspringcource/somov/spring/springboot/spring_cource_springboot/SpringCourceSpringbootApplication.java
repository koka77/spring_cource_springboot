package org.udemyspringcource.somov.spring.springboot.spring_cource_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // если конфигурация хранится в отдельном пакете (scanBasePackages = "org.udemyspringcource.somov.spring.springboot")
public class SpringCourceSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCourceSpringbootApplication.class, args);
    }

}

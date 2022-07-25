package io.pragra.learning.main.springsession2.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Data
@Component
public class Person { //POGO CLASS

    @Value("${person.name:'Vivek'}")
    private String name;
    @Value("${person.age}")
    private int age;
    @Value("#{'${person.hobbies}'.split(',')}")
    private List<String>hobbies;
    @PostConstruct
    public void init() {
        System.out.println("jshdkpkscm,");
    }
        @PreDestroy
        public void destroy(){
            System.out.println("destroy");
        }
    }


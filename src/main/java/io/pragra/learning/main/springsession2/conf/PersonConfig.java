package io.pragra.learning.main.springsession2.conf;

import io.pragra.learning.main.springsession2.domain.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;


@Configuration

//@PropertySource("classpath:person.properties")
public class PersonConfig {

  /*  @Value("${person.name:'Vivek'}")//vivek is default value
    private String name;
    @Value("${person.age}")
    private int age;
    @Value("#{'${person.hobbies}'.split(',')}")
    private List<String>hobbies; */


    @Bean
    public Person person(@Value("${person.name:'Vivek'}")String name,
                         @Value("${person.age}")int age,
                         @Value("#{'${person.hobbies}'.split(',')}")List<String>hobbies){
        Person p = new Person();
        p.setName(name);
        p.setAge(age);
        p.setHobbies(hobbies);
        return p;
    }
}

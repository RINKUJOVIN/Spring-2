package io.pragra.learning.main.springsession2;

import io.pragra.learning.main.springsession2.conf.AppConfig;
import io.pragra.learning.main.springsession2.conf.PersonConfig;
import io.pragra.learning.main.springsession2.domain.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;


//@SpringBootApplication
@PropertySource("classpath:person.properties")
public class Spring2Application {

    public static void main(String[] args) {

        //SpringApplication.run(Spring2Application.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("io.pragra.learning.main.springsession2.conf","io.pragra.learning.main.springsession2.domain");
        ITeam bean = context.getBean("raptors",ITeam.class);
        System.out.println(bean);

        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        System.out.println(context.getBean(Employee.class));
        System.out.println(context.getBean(Manager.class));

        System.out.println(context.getBean("raptors",ITeam.class));
        Game game = context.getBean(Game.class);
        System.out.println(game.startGame());

    }

}

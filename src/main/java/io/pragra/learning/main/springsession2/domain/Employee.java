package io.pragra.learning.main.springsession2.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Employee {

    private Person person;
    private double salary=2000;

    @Autowired
    public Employee(Person person) {
        this.person = person;
    }
}

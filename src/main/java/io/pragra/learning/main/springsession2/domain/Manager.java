package io.pragra.learning.main.springsession2.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Manager {
    @Value("${desgination:'CEO'}")
    private String desgination;
    @Autowired
    private Person person;
}

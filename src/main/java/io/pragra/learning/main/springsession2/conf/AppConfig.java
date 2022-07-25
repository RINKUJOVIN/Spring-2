package io.pragra.learning.main.springsession2.conf;

import io.pragra.learning.main.springsession2.domain.ITeam;
import io.pragra.learning.main.springsession2.domain.Lakers;
import io.pragra.learning.main.springsession2.domain.TorontoRaptors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;


@Configuration
@PropertySource("classpath:teams.properties")
@PropertySource("classpath:person.properties")
public class AppConfig {

    @Value("${team.name}")
    private String teamName;
    @Value("${team.city}")
    private String teamCity;

    //@Scope("prototype")
    @Bean(initMethod = "init")

    public ITeam raptors() {
        return new TorontoRaptors(teamName, teamCity);
    }
        public ITeam lakers() {
            return new Lakers("Lakers","Los Angles");

    }
    private String getName(){
        return "Raptors";
    }
}

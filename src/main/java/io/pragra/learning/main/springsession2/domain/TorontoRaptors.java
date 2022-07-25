package io.pragra.learning.main.springsession2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TorontoRaptors implements ITeam{
    private String teamName;
    private String teamCity;

    @Override
    public String getTeamName() {
        return teamName;
    }

    @Override
    public void init() {
        System.out.println("Initializing....");
    }
}

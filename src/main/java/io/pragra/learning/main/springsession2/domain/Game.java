package io.pragra.learning.main.springsession2.domain;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Game {
    private ITeam home;
    private ITeam away;

    public Game(@Qualifier("raptors") ITeam home, @Qualifier("lakers") ITeam away) {
        this.home = home;
        this.away = away;
    }
    public ITeam startGame(){
        return Math.random()>0.5 ? home:away;
    }
}


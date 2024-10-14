package com.cricket.comparision.Model;

import org.springframework.stereotype.Component;


import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public abstract class Bowling {
    @Id
    private String player_name;
    private int matches;
    private int innings;
    private int runs;
    private int balls;
    private int maidens;
    private int wickets;
    private float average;
    private float economy;
    private float strike_rate;
    private String best_bowling;
    private int hattrick;
    private int four_wicket;
    private int five_wicket;
    private int ten_wicket;
    private int ranking;
}

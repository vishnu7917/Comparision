package com.cricket.comparision.Model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public abstract class Batting {
    @Id
    private String player_name;
    private int matches;
    private int innings;
    private int runs;
    private int balls;
    private int highest_score;
    private float average;
    private float strike_rate;
    private int not_out;
    private int fours;
    private int sixes;
    private int ducks;
    private int half_centuries;
    private int centuries;
    private int double_centuries;
    private int ranking;
}

package com.cricket.comparision.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Player {
    @Id
    private String player_Name;
    private int age;
    private String place_Of_Birth;
    private float height;
    private String batting_Style;
    private String bowling_Style;
    private String country;
    private String date_of_Birth;
}

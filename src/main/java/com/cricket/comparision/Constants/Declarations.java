package com.cricket.comparision.Constants;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cricket.comparision.Model.Batting;
import com.cricket.comparision.Model.Bowling;

import lombok.Data;

@Data
@Component
public class Declarations {
    
    /* 
     * Returns Batting statistics
    */
    public static List<String> getBatStats()
    {
        Class<?> bat= Batting.class;
        Field[] batStats= bat.getDeclaredFields();
        List<String> batStatistics=new ArrayList<>();
        for(Field field: batStats)
        {
            batStatistics.add(field.getName());
        }
        return batStatistics;
    }
    /*
     * Returns Bowling statistics
     */
    public static List<String> getBowlStats()
    {
        Class<?> bowl=Bowling.class;
        Field[] bowlStats=bowl.getDeclaredFields();
        List<String> bowlStatistics=new ArrayList<>();
        for(Field field: bowlStats)
        {
            bowlStatistics.add(field.getName());
        }
        return bowlStatistics;
    }
    public static final List<String> match_types= List.of("Test_Batting","Test_Bowling","Odi_Batting","Odi_Bowling","T20_Batting","T20_Bowling","Ipl_Batting","Ipl_Bowling");
    public static final List<String> batting_lesser_is_greater= List.of("ranking","ducks");
    public static final List<String> bowling_lesser_is_greater= List.of("ranking","runs","economy");
    
}

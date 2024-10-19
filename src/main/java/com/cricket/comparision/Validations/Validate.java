package com.cricket.comparision.Validations;


import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.comparision.Constants.Declarations;
import com.cricket.comparision.Repositories.PlayersRepo;


@Service
public class Validate {
    @Autowired
    PlayersRepo playersRepo;
    private static final Logger logger= LoggerFactory.getLogger(Validate.class);
    public List<String> validate_player_names(List<String> player_Names) 
    {
        List<String> InDBNames= playersRepo.getAllPlayerNames();
        if(InDBNames.isEmpty())
        {
            logger.info("InDb player names list received in empty");
        }
        logger.info("Validating player names");
        List<String> validPlayerNames= player_Names.stream().filter(name-> InDBNames.contains(name)).collect(Collectors.toList());
        return validPlayerNames;

    }
    public Map<String, String> validate_comparision_stats(Map<String,String> comparision_Stats) 
    {
        logger.info("Validating given player stats-[MatchType:Statistic]");
        Map<String, String> validated_stats=new HashMap<>();
        for(Map.Entry<String,String> entry : comparision_Stats.entrySet())
        {
            if(Declarations.match_types.contains(entry.getKey()))
            {
                //checking weather it is a batting stat or bowling stat
                if(entry.getKey().contains("Batting"))
                {
                    if(Declarations.getBatStats().contains(entry.getValue()))
                    {
                        validated_stats.put(entry.getKey(), entry.getValue());
                    }
                }
                else
                {
                    if(Declarations.getBowlStats().contains(entry.getValue()))
                    {
                        validated_stats.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        return validated_stats;
    }
    
}

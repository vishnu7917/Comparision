package com.cricket.comparision.Services;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cricket.comparision.Model1.Comparision_Request;
import com.cricket.comparision.Model1.Comparision_Result;
import com.cricket.comparision.Validations.Validate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Service
public class Compare_Service {
    @Autowired
    Validate validate;
    @Autowired
    EntityManager entityManager;

    private static final Logger logger= LoggerFactory.getLogger(Compare_Service.class); 
    public ResponseEntity<?> compare(Comparision_Request request)
    {
        logger.info("Inside compare service class");
        //Validate player Names
        List<String> valid_names = validate.validate_player_names(request.getPlayer_names());
        Map<String,String> valid_comparision_stats= validate. validate_comparision_stats(request.getComparision_Stats());
        if(valid_names.isEmpty() || valid_comparision_stats.isEmpty())
        {
            return ResponseEntity.badRequest().body("Invalid Details \n" + valid_names +" \n" + valid_comparision_stats);
        }
        List<Comparision_Result> final_result=performComparing(valid_names,valid_comparision_stats);
        return ResponseEntity.ok().body(final_result);
    }
    public List<Comparision_Result> performComparing(List<String> player_names, Map<String,String> stats)
    {
        List<Comparision_Result> comparision_result=new ArrayList<>();
        for(Map.Entry<String,String> map: stats.entrySet())
        {
            Comparision_Result result= new Comparision_Result();
            result.setMatch_type(map.getKey());
            result.setStat(map.getValue());
            result.setValues(getStatValuesFromDb(map.getKey(),map.getValue(),player_names));
            comparision_result.add(result);
        }
        return comparision_result;
    }
    public Map<String,Float> getStatValuesFromDb(String match_type,String match_stat, List<String> player_names)
    {
        logger.info("In getting values from Db method.");
        String sqlquery="select player_name , "+match_stat+" from "+match_type+" where player_name in :player_names";
        Query query= entityManager.createNativeQuery(sqlquery);
        query.setParameter("player_names", player_names);
        @SuppressWarnings("unchecked")
        List<Object[]> list=query.getResultList();
        //creating map to store the list of details
        Map<String,Float> playerNameAndStat=new HashMap<>();
        for(Object[] obj:list)
        {
            String player_name=obj[0].toString();
            Float stat_value=Float.parseFloat(obj[1].toString());
            playerNameAndStat.put(player_name, stat_value);
        }
        return playerNameAndStat;
    }


    
}

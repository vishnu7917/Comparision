package com.cricket.comparision.Services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cricket.comparision.Model.Ipl_Bowling;
import com.cricket.comparision.Model.Odi_Bowling;
import com.cricket.comparision.Model.T20_Bowling;
import com.cricket.comparision.Model.Test_Bowling;
import com.cricket.comparision.Repositories.Ipl_bowling;
import com.cricket.comparision.Repositories.Odi_bowling;
import com.cricket.comparision.Repositories.T20_bowling;
import com.cricket.comparision.Repositories.Test_bowling;

@Service
public class Bowling_Service {

     @Autowired
    private Test_bowling testrepo;
    @Autowired
    private Odi_bowling odirepo;
    @Autowired
    private T20_bowling t20repo;
    @Autowired
    private Ipl_bowling iplrepo;
    

    public ResponseEntity<?> testStats(String name)
    {
        Optional<Test_Bowling> bowling= testrepo.findById(name);
        if(bowling.isEmpty())
        {
            return ResponseEntity.badRequest().body("No data Found. Will be updated soon");
        }
        return ResponseEntity.ok().body(bowling);
    }
    public ResponseEntity<?> odiStats(String name)
    {
        Optional<Odi_Bowling> bowling= odirepo.findById(name);
        if(bowling.isEmpty())
        {
            return ResponseEntity.badRequest().body("No data Found. Will be updated soon");
        }
        return ResponseEntity.ok().body(bowling);
    }
    public ResponseEntity<?> t20Stats(String name)
    {
        Optional<T20_Bowling> bowling= t20repo.findById(name);
        if(bowling.isEmpty())
        {
            return ResponseEntity.badRequest().body("No data Found. Will be updated soon");
        }
        return ResponseEntity.ok().body(bowling);
    }
    public ResponseEntity<?> iplStats(String name)
    {
        Optional<Ipl_Bowling> bowling= iplrepo.findById(name);
        if(bowling.isEmpty())
        {
            return ResponseEntity.badRequest().body("No data Found. Will be updated soon");
        }
        return ResponseEntity.ok().body(bowling);
    }

    
}

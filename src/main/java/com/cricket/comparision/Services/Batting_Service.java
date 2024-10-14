package com.cricket.comparision.Services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cricket.comparision.Model.Ipl_Batting;
import com.cricket.comparision.Model.Odi_Batting;
import com.cricket.comparision.Model.T20_Batting;
import com.cricket.comparision.Model.Test_Batting;
import com.cricket.comparision.Repositories.Ipl_batting;
import com.cricket.comparision.Repositories.Odi_batting;
import com.cricket.comparision.Repositories.T20_batting;
import com.cricket.comparision.Repositories.Test_batting;


@Service
public class Batting_Service {

    @Autowired
    private Test_batting testrepo;
    @Autowired
    private Odi_batting odirepo;
    @Autowired
    private T20_batting t20repo;
    @Autowired
    private Ipl_batting iplrepo;
    

    public ResponseEntity<?> testStats(String name)
    {
        Optional<Test_Batting> batting= testrepo.findById(name);
        if(batting.isEmpty())
        {
            return ResponseEntity.badRequest().body("No data Found. Will be updated soon");
        }
        return ResponseEntity.ok().body(batting);
    }
    public ResponseEntity<?> odiStats(String name)
    {
        Optional<Odi_Batting> batting= odirepo.findById(name);
        if(batting.isEmpty())
        {
            return ResponseEntity.badRequest().body("No data Found. Will be updated soon");
        }
        return ResponseEntity.ok().body(batting);
    }
    public ResponseEntity<?> t20Stats(String name)
    {
        Optional<T20_Batting> batting= t20repo.findById(name);
        if(batting.isEmpty())
        {
            return ResponseEntity.badRequest().body("No data Found. Will be updated soon");
        }
        return ResponseEntity.ok().body(batting);
    }
    public ResponseEntity<?> iplStats(String name)
    {
        Optional<Ipl_Batting> batting= iplrepo.findById(name);
        if(batting.isEmpty())
        {
            return ResponseEntity.badRequest().body("No data Found. Will be updated soon");
        }
        return ResponseEntity.ok().body(batting);
    }

}

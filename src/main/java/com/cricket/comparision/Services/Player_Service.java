package com.cricket.comparision.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cricket.comparision.Repositories.PlayersRepo;
import com.cricket.comparision.Model.Player;
import java.util.*;

@Service
public class Player_Service {
    @Autowired
    private PlayersRepo repo;

    public List<Player> getAllPlayers()
    {
        return repo.findAll();
    }

    public ResponseEntity<?> getPlayer(String player_name) {
        Optional<Player> player=repo.findById(player_name);
        if(player.isPresent())
        {
            return ResponseEntity.ok().body(player);
        }
        else
        {
            return ResponseEntity.badRequest().body("Player Details are not available at the moment");
        }
    }
    
}

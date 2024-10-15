package com.cricket.comparision.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cricket.comparision.Model.Player;
import java.util.List;
import com.cricket.comparision.Services.Player_Service;


@RestController
@RequestMapping("/")
public class Player_Controller {
    @Autowired
    private Player_Service service;

    @GetMapping("All")
    public List<Player> getAllPlayers()
    {
        return service.getAllPlayers();
    }
    @GetMapping("Player/{player_name}")
    public ResponseEntity<?> getPlayer(@PathVariable String player_name)
    {
        return service.getPlayer(player_name);
    }

}

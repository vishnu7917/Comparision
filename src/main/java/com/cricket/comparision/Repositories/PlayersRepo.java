package com.cricket.comparision.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricket.comparision.Model.Player;

@Repository
public interface PlayersRepo extends JpaRepository<Player,String>{
    
}

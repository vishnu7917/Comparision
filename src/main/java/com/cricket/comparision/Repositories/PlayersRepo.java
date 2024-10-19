package com.cricket.comparision.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cricket.comparision.Model.Player;

@Repository
public interface PlayersRepo extends JpaRepository<Player,String>{
    @Query(value="select player_name from player",nativeQuery=true)
    List<String> getAllPlayerNames();
}

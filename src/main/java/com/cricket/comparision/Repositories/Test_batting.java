package com.cricket.comparision.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cricket.comparision.Model.Test_Batting;

@Repository
public interface Test_batting extends JpaRepository<Test_Batting, String> {
    
}

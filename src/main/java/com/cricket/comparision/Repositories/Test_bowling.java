package com.cricket.comparision.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cricket.comparision.Model.Test_Bowling;

@Repository
public interface Test_bowling extends JpaRepository<Test_Bowling, String> {
    
}

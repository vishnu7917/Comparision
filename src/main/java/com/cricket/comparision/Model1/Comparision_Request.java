package com.cricket.comparision.Model1;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comparision_Request {
    private List<String> player_names;
    private Map<String,String> comparision_Stats;
    
}

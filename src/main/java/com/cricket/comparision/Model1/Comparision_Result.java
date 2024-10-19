package com.cricket.comparision.Model1;

import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comparision_Result {
    private String match_type;
    private String stat;
    private Map<String,Float> values;
    private String champ;
}

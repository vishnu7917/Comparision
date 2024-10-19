package com.cricket.comparision.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.comparision.Model1.Comparision_Request;
import com.cricket.comparision.Services.Compare_Service;

@RestController
@RequestMapping("/")
public class Comparision_Controller {
    @Autowired
    Compare_Service service;
    @GetMapping("compare")
    public ResponseEntity<?> compare(@RequestBody Comparision_Request comparision_Request)
    {
        System.out.println(comparision_Request);
        return service.compare(comparision_Request);
    }
}

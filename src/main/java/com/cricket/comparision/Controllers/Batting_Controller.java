package com.cricket.comparision.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cricket.comparision.Services.Batting_Service;

@RestController
@RequestMapping("/bat")
public class Batting_Controller {
    private static final Logger logger= LoggerFactory.getLogger(Batting_Controller.class);
    @Autowired
    private Batting_Service service;

    @GetMapping("test/{name}")
    public ResponseEntity<?> test(@PathVariable String name) {
        logger.info("In Test Batting Controller");
        return service.testStats(name);
    }
    @GetMapping("odi/{name}")
    public ResponseEntity<?> odi(@PathVariable String name) {
        logger.info("In Odi Batting Controller");
        return service.odiStats(name);
    }
    @GetMapping("t20/{name}")
    public ResponseEntity<?> t20(@PathVariable String name) {
        logger.info("In T20 Batting Controller");
        return service.t20Stats(name);
    }
    @GetMapping("ipl/{name}")
    public ResponseEntity<?> ipl(@PathVariable String name) {
        logger.info("In Ipl Batting Controller");
        return service.iplStats(name);
    }
    
}

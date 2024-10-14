package com.cricket.comparision.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cricket.comparision.Services.Bowling_Service;

@RestController
@RequestMapping("/bowl")
public class Bowling_Controller {
    private final static Logger logger= LoggerFactory.getLogger(Bowling_Controller.class);
    @Autowired
    private Bowling_Service service;

    @GetMapping("test/{name}")
    public ResponseEntity<?> test(@PathVariable String name) {
        logger.info("In Test Bowling Controller");
        return service.testStats(name);
    }
    @GetMapping("odi/{name}")
    public ResponseEntity<?> odi(@PathVariable String name) {
        logger.info("In Odi Bowling Controller");
        return service.odiStats(name);
    }
    @GetMapping("t20/{name}")
    public ResponseEntity<?> t20(@PathVariable String name) {
        logger.info("In T20 Bowling Controller");
        return service.t20Stats(name);
    }
    @GetMapping("ipl/{name}")
    public ResponseEntity<?> ipl(@PathVariable String name) {
        logger.info("In Ipl Bowling Controller");
        return service.iplStats(name);
    }
    
}

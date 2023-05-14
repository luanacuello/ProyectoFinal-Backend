package com.example.BACKEND.Demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("BACKEND/demo-controller")
public class DemoController {
    
    @GetMapping
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("hey btch!");
    }
}

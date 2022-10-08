package com.richard.devopsautomation.apis.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class CommonController {
  
  @GetMapping("/check-status")
  public ResponseEntity<String> checkStatus(){
    return new ResponseEntity<>("ok", HttpStatus.OK);
  }
  
}

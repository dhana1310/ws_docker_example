package com.myasyouwish.ws_docker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("forFunGetCall")
    public ResponseEntity<String> getCallForFun() {

        return new ResponseEntity<>("Request Received", HttpStatus.OK);
    }

}


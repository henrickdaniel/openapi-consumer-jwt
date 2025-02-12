package com.henricksoares.tokenjwt.tokenjwtclient.controller;

import com.henricksoares.tokenjwt.tokenjwtclient.service.HelloService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class MyController {

    private HelloService helloService;

    @GetMapping("/say-hello")
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>(helloService.sayHello(), HttpStatus.OK);
    }
}
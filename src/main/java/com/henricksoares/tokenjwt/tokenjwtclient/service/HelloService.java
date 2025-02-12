package com.henricksoares.tokenjwt.tokenjwtclient.service;

import com.henricksoares.tokenjwt.tokenjwtclient.controller.AuthService;
import com.henricksoares.tokenjwt.tokenjwtclient.generated.SayHelloApi;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class HelloService {

    private final SayHelloApi sayHelloApi;
    private final AuthService authService;

    public String sayHello() {
        sayHelloApi.getApiClient().setBearerToken(this.authService.generateToken("henrick.soares99", "abc"));
        return sayHelloApi.sayHelloOperation().block();
    }
}
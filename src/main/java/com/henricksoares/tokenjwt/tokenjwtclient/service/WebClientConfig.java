package com.henricksoares.tokenjwt.tokenjwtclient.service;

import com.henricksoares.tokenjwt.tokenjwtclient.ApiClient;
import com.henricksoares.tokenjwt.tokenjwtclient.generated.SayHelloApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    private static final String URL_BASE = "http://localhost:8080";

    @Bean
    public WebClient webClient() {
        return WebClient.builder().baseUrl(URL_BASE).build();
    }

    @Bean
    public SayHelloApi sayHelloApi (WebClient webClient) {
        ApiClient apiClient = new ApiClient(webClient);
        return new SayHelloApi(apiClient);
    }
}

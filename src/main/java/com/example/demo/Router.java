package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration
public class Router {
    @Bean
    public RouterFunction<ServerResponse> route() {
        return RouterFunctions.route(GET(""),
                                     serverRequest -> ServerResponse.ok()
                                                                    .contentType(MediaType.TEXT_PLAIN)
                                                                    .body(BodyInserters.fromObject("ok")));
    }
}
package com.sylix.postapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("v1")
public class RestControllerV1 {

    @RequestMapping("systems/ping")
    private String ping() {
        return "hello ! World !!";
    }

}

package com.sylix.postapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
class RestControllerV1 {


    @RequestMapping("systems/ping")
    fun ping(): String {
        return "hello ! World !!";
    }
}










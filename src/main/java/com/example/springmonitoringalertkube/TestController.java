package com.example.springmonitoringalertkube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/data")
    public String getData() {
        return "message from k8";
    }

    @GetMapping("/forError")
    public void getError() {
        throw new RuntimeException("Error");
    }
}

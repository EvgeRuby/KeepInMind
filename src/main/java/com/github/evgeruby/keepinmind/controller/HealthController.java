package com.github.evgeruby.keepinmind.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public Map<String, Object> healthReadiness() {
        return Map.of("status", "ok");
    }
}

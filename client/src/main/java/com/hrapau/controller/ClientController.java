package com.hrapau.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @GetMapping("/client-info")
    String getRoot() {
        return "MetaInfo client";
    }
}

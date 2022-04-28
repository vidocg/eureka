package com.hrapau.controller;

import com.hrapau.controller.client.ClientContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaServiceController {
    @Autowired
    ClientContract clientContract;

    @GetMapping("/data")
    String getData() {
        return "data";
    }

    @GetMapping("/client-data")
    String getClientData() {
        return clientContract.getClientInfo();
    }
}

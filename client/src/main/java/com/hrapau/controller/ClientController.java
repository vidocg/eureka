package com.hrapau.controller;

import com.hrapau.model.dto.ClientDto;
import com.hrapau.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/client-info")
    String getRoot() {
        return "MetaInfo client";
    }

    @GetMapping("/clients")
    List<ClientDto> getClients() {
        return clientService.getAll();
    }
}

package com.hrapau.service;

import com.hrapau.dao.ClientDao;
import org.springframework.stereotype.Component;

@Component
public class ClientService {
    private ClientDao clientDao;

    public ClientService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }
}

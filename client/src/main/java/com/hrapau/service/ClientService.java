package com.hrapau.service;

import com.hrapau.dao.ClientDao;
import com.hrapau.mappers.ResponseMapper;
import com.hrapau.model.dto.ClientDto;
import com.hrapau.model.entity.Client;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientService {
    private final ClientDao clientDao;
    private final ResponseMapper responseMapper;

    public ClientService(ClientDao clientDao, ResponseMapper responseMapper) {
        this.responseMapper = responseMapper;
        this.clientDao = clientDao;
    }

    public List<ClientDto> getAll() {
        List<Client> clients = clientDao.findAll();
        return responseMapper.toClientDtos(clients);
    }
}

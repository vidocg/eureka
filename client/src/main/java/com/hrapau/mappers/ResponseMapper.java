package com.hrapau.mappers;

import com.hrapau.model.dto.ClientDetailsDto;
import com.hrapau.model.dto.ClientDto;
import com.hrapau.model.entity.Client;
import com.hrapau.model.entity.ClientDetails;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ResponseMapper {
    ClientDto toClientDto(Client client);

    ClientDetailsDto toClientDetailsDto(ClientDetails clientDetails);

    List<ClientDto> toClientDtos(List<Client> cliens);

    List<ClientDetailsDto> toClientDetailsDto(List<ClientDetails> clientDetails);
}

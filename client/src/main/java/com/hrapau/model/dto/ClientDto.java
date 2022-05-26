package com.hrapau.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class ClientDto {
    private Long id;
    private String name;
    private String email;
    private List<ClientDetailsDto> details;
}

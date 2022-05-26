package com.hrapau.model.dto;

import com.hrapau.model.entity.Client;
import lombok.Data;

@Data
public class ClientDetailsDto {
    private Long id;
    private String details;
    private Boolean active;
}

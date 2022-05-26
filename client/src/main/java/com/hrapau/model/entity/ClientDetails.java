package com.hrapau.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ClientDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String details;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="client_id", nullable=false)
    private Client client;
    private Boolean active;
}

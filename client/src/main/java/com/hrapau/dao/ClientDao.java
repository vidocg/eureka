package com.hrapau.dao;

import com.hrapau.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Long, Client> {
}

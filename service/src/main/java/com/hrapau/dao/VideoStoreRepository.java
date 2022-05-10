package com.hrapau.dao;

import com.hrapau.model.entity.VideoStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoStoreRepository extends JpaRepository<VideoStore, Long> {
}

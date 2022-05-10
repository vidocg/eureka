package com.hrapau.service;

import com.hrapau.dao.VideoStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoStoreService {
    private VideoStoreRepository videoStoreRepository;

    @Autowired
    public VideoStoreService (VideoStoreRepository videoStoreRepository) {
        this.videoStoreRepository = videoStoreRepository;
    }
}

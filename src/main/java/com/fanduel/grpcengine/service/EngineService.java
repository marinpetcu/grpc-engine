package com.fanduel.grpcengine.service;

import com.fanduel.grpcengine.model.EngineRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EngineService {

    private final Logger logger = LoggerFactory.getLogger(EngineService.class);

    public void withdraw(EngineRequest request) {
        logger.info("Should call handler withdraw endpoint through gRPC");
    }
}

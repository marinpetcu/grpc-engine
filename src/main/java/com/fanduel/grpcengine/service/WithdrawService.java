package com.fanduel.grpcengine.service;

import com.fanduel.grpcengine.model.WithdrawRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WithdrawService {

    private final Logger logger = LoggerFactory.getLogger(WithdrawService.class);

    public void withdraw(WithdrawRequest request) {
        logger.info("Should call handler withdraw endpoint through gRPC");
    }
}

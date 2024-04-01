package com.fanduel.grpcengine.controller;

import com.fanduel.grpcengine.model.EngineRequest;
import com.fanduel.grpcengine.service.EngineService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/engine")
public class EngineController {

    private final EngineService engineService;

    public EngineController(EngineService engineService) {
        this.engineService = engineService;
    }

    @PostMapping
    public void withdraw(@RequestBody EngineRequest request) {
        engineService.withdraw(request);
    }
}

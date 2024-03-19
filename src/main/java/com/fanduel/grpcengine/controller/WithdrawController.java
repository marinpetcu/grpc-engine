package com.fanduel.grpcengine.controller;

import com.fanduel.grpcengine.model.WithdrawRequest;
import com.fanduel.grpcengine.service.WithdrawService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/withdraw")
public class WithdrawController {

    private final WithdrawService withdrawService;

    public WithdrawController(WithdrawService withdrawService) {
        this.withdrawService = withdrawService;
    }

    @PostMapping
    public void withdraw(@RequestBody WithdrawRequest request) {
        withdrawService.withdraw(request);
    }
}

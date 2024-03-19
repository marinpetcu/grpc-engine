package com.fanduel.controller;

import com.fanduel.model.WithdrawRequest;
import com.fanduel.service.WithdrawService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("withdraw")
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

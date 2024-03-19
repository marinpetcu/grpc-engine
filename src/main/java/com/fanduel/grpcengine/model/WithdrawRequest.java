package com.fanduel.grpcengine.model;

import java.math.BigDecimal;

public record WithdrawRequest(
        String requestId,
        BigDecimal amount,
        Long userId
) {
}

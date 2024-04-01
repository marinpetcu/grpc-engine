package com.fanduel.grpcengine.model;

import java.math.BigDecimal;

public record EngineRequest(
        String requestId,
        BigDecimal amount,
        Long userId
) {
}

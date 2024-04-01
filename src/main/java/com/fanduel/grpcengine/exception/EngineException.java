package com.fanduel.grpcengine.exception;

import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import javax.annotation.Nullable;

public class EngineException extends StatusRuntimeException {

    public EngineException(Status status) {
        super(status);
    }

    public EngineException(Status status, @Nullable Metadata trailers) {
        super(status, trailers);
    }
}

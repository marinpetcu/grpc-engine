package com.fanduel.grpcengine.service;

import com.fanduel.grpc.lib.EngineContributeRequest;
import com.fanduel.grpc.lib.EngineContributeResponse;
import com.fanduel.grpc.lib.EngineContributeServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GrpcService
public class ContributeService extends EngineContributeServiceGrpc.EngineContributeServiceImplBase {

    private final Logger logger = LoggerFactory.getLogger(ContributeService.class);

    @Override
    public void contribute(EngineContributeRequest request, StreamObserver<EngineContributeResponse> responseObserver) {
        logger.info("Received request: " + request);

        EngineContributeResponse response = EngineContributeResponse.newBuilder()
                .setResponseId(request.getRequestId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

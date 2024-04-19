package com.fanduel.grpcengine.service;

import beyondplay.contrib.v1.ContributionServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static beyondplay.contrib.v1.Contribute.*;

@GrpcService
public class ContributeService extends ContributionServiceGrpc.ContributionServiceImplBase {

    private final Logger logger = LoggerFactory.getLogger(ContributeService.class);

    @Override
    public void contribute(ContributeRequest request, StreamObserver<ContributeResponse> responseObserver) {
        logger.info("Received request: " + request);

        ContributeResponse response = ContributeResponse.newBuilder().build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

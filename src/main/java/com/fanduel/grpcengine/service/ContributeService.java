package com.fanduel.grpcengine.service;

import com.fanduel.marin.contrib.ContributeRequest;
import com.fanduel.marin.contrib.ContributeResponse;
import com.fanduel.marin.contrib.ContributionServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

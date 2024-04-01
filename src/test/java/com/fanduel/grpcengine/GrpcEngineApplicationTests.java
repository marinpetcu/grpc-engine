package com.fanduel.grpcengine;

import com.fanduel.marin.contrib.ContributeRequest;
import com.fanduel.marin.contrib.Contribution;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.fanduel.marin.contrib.ContributionServiceGrpc.ContributionServiceBlockingStub;

@SpringBootTest(properties = {
        "grpc.server.inProcessName=test", // Enable inProcess server
        "grpc.server.port=-1", // Disable external server
        "grpc.client.contribution.address=in-process:test" // Configure the client to connect to the inProcess server
})
class GrpcEngineApplicationTests {

    @GrpcClient("contribution")
    private ContributionServiceBlockingStub contributionService;

    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        ContributeRequest contributeRequest = ContributeRequest.newBuilder()
                .setData(Contribution.newBuilder()
                        .setGameroundId("roundId")
                        .build())
                .build();

        contributionService.contribute(contributeRequest);
    }
}

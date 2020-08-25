package com.darrenforsythe.testcontainerslocalstackawssdkissue;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.localstack.LocalStackContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
class TCAWSSDKIssueTest {

    @Container
    private static final LocalStackContainer LOCAL_STACK_CONTAINER = new LocalStackContainer(
            DockerImageName.parse("localstack/localstack:latest")
    ).withServices(LocalStackContainer.Service.SQS);


    @Test
    void testFail() {
        LOCAL_STACK_CONTAINER.getAccessKey();
    }
}

package com.camunda.consulting;

import io.camunda.connector.runtime.jobworker.ConnectorJobHandler;
import io.camunda.zeebe.client.ZeebeClient;

public class App {

  public static void main(String[] args) {

    var zeebeClient = ZeebeClient.newClientBuilder().gatewayAddress("host.docker.internal:26500").usePlaintext().build();

    zeebeClient.newWorker()
        .jobType("com.acme.connectors.SendMail:1")
        .handler(new ConnectorJobHandler(new FakeMailConnectorFunction()))
        .name("FakeEmailWorker")
        .fetchVariables("sender", "receivers","messageBody")
        .open();
  }
}

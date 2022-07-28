# camunda-connectors-playground

This is a playground to get started with Modeler-Templates and Connectors in Camunda 8.
It contains the connector-sdk as submodule, it can be checked out with 

```git submodule update --init --recursive```

The repo contains a .camunda folder that holds an element-template description as .json. The modeler should load this as soon as you open the process.bpmn.

Deploy the process and start an instance with the payload:

```{"firstName": "Susi"}```

Run the connector by executing the main class App.

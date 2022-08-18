package com.camunda.consulting;

import io.camunda.connector.api.ConnectorContext;
import io.camunda.connector.api.ConnectorFunction;

public class FakeMailConnectorFunction implements ConnectorFunction {

    @Override
    public Object execute(ConnectorContext context) throws Exception {
        String variables = context.getVariables();
        RequestObj req = context.getVariablesAsType(RequestObj.class);
        System.out.println("Variables as Json: " + variables);
        System.out.println("Variables as Object: " + req.toString());
        return new ResponseObj("Bla", "Blubb");
        //return "Bla";
    }
}

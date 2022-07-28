package com.camunda.consulting;

public class ResponseObj{
    String s= "Bla";
    String resultStatus;

    public ResponseObj(String s, String resultStatus ){
        this.s = s;
        this.resultStatus = resultStatus;
    }

    public String getS(){
        return s;
    }

    public String getResultStatus(){
        return this.resultStatus;
    }
}
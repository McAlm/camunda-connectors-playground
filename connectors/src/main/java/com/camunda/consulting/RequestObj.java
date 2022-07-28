package com.camunda.consulting;

public class RequestObj{

    String sender, receivers, messageBody;

    public RequestObj(){}


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceivers() {
        return receivers;
    }

    public void setReceivers(String receivers) {
        this.receivers = receivers;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }


    @Override
    public String toString() {
        return "RequestObj [messageBody=" + messageBody + ", receivers=" + receivers + ", sender=" + sender + "]";
    }

}

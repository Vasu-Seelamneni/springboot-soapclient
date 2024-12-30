package com.sws.springbootsoapclient.serviceclient;

import com.sws.springbootsoapclient.stub.CreateAccountRequest;
import com.sws.springbootsoapclient.stub.CreateAccountResponse;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapClientService {

    private final WebServiceTemplate webServiceTemplate;

    public SoapClientService(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public CreateAccountResponse createAccount(CreateAccountRequest request) {
        return (CreateAccountResponse) webServiceTemplate.marshalSendAndReceive(request);
    }
}

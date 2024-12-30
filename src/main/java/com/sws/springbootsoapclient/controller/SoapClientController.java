package com.sws.springbootsoapclient.controller;

import com.sws.springbootsoapclient.serviceclient.SoapClientService;
import com.sws.springbootsoapclient.stub.CreateAccountRequest;
import com.sws.springbootsoapclient.stub.CreateAccountResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/soap")
public class SoapClientController {

    private final SoapClientService soapClientService;

    public SoapClientController(SoapClientService soapClientService) {
        this.soapClientService = soapClientService;
    }

    @RequestMapping("/createAccount")
    public ResponseEntity<CreateAccountResponse> createAccount(@RequestBody CreateAccountRequest request) {
        CreateAccountResponse response = soapClientService.createAccount(request);
        return ResponseEntity.ok(response);
    }
}

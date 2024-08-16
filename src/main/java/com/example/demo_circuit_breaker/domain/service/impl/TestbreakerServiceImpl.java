package com.example.demo_circuit_breaker.domain.service.impl;

import com.example.demo_circuit_breaker.domain.service.ITestbreakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestbreakerServiceImpl  implements ITestbreakerService {

    private RestTemplate restTemplate;
    @Autowired
    public TestbreakerServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public String getUrlExternal() throws Exception
    {
        try {
            restTemplate.getForEntity("https://www.google.com", String.class);
            return "Pago procesado correctamente";
        } catch (Exception ex) {
            throw ex;
        }
    }
}

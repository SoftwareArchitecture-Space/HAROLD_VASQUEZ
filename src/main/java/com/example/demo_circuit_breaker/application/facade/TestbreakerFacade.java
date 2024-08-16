package com.example.demo_circuit_breaker.application.facade;


import com.example.demo_circuit_breaker.domain.service.ITestbreakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestbreakerFacade {

    @Autowired
    private final ITestbreakerService testbreakerService;

    public TestbreakerFacade(ITestbreakerService testbreakerService) {
        this.testbreakerService = testbreakerService;
    }

    public String getUrlExternal() throws Exception {
        return testbreakerService.getUrlExternal();
    }
}

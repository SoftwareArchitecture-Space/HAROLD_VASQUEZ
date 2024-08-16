package com.example.demo_circuit_breaker.infrastructure.controllers;

import com.example.demo_circuit_breaker.application.facade.TestbreakerFacade;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestbreakerController {
    @Autowired
    private TestbreakerFacade testbreakerFacade;
    @GetMapping("/getUrlExternal")
    @CircuitBreaker(name = "getUrlExternal", fallbackMethod = "fallbackMethod")
    public String getUrlExternal() throws Exception {
        return testbreakerFacade.getUrlExternal();
    }

    public String fallbackMethod(Throwable throwable) {
        return "Lo sentimos, actualmente estamos experimentando dificultades técnicas para procesar pagos en línea. Por favor, inténtalo de nuevo más tarde. Agradecemos tu paciencia y comprensión.";
    }

}

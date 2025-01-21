package com.example.payment_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@GetMapping()
    public String getPayment() {
        return "Payment service is running, testing!";
    }
}

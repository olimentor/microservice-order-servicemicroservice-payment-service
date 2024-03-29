package com.microservice.ps.api.controller;

import com.microservice.ps.api.entity.Payment;
import com.microservice.ps.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService service;
@PostMapping("/doPayment")
    public Payment doPayment (@RequestBody Payment payment){
        return service.doPayment(payment);
    }
@GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOrderId(@PathVariable int orderId){
      return service.findPaymentHistoryByOrderId(orderId);
    }

}

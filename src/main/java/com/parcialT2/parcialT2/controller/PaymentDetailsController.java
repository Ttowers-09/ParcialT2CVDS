package com.parcialT2.parcialT2.controller;

import com.parcialT2.parcialT2.models.PaymentDetails;
import com.parcialT2.parcialT2.service.paymentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/v1/paymentDetail")
public class PaymentDetailsController {

    private final paymentDetailsService paymentDetailsService;

    public PaymentDetailsController(paymentDetailsService paymentDetailsService) {
        this.paymentDetailsService = paymentDetailsService;
    }

    @PostMapping("/save")
    public PaymentDetails save(@RequestBody PaymentDetails paymentDetails) {
        return paymentDetailsService.save(paymentDetails);
    }

    @GetMapping("/{id}")
    public PaymentDetails findById(@PathVariable Integer id) {
        return paymentDetailsService.findById(id);
    }
}

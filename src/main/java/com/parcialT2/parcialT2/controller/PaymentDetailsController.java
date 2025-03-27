package com.parcialT2.parcialT2.controller;

import com.parcialT2.parcialT2.models.PaymentDetails;
import com.parcialT2.parcialT2.service.paymentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1/paymentDetail")
public class PaymentDetailsController {
    @Autowired
    private paymentDetailsService paymentDetailsService;

    @PostMapping("/save")
    private paymentDetailsService save(@RequestBody PaymentDetails paymentDetails){
        return paymentDetailsService.save(Paymentdetails);
    }
}

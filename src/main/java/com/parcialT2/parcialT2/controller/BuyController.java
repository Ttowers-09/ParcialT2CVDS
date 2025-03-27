package com.parcialT2.parcialT2.controller;

import com.parcialT2.parcialT2.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/buy")
public class BuyController {
    @Autowired
    private BuyService buyService;

    @GetMapping("/all")
    public ResponseEntity <?> getPaymentDetail(){
        return ResponseEntity.ok(buyService.getBuyDetails());
    }
    
}

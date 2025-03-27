package com.parcialT2.parcialT2.controller;

import com.parcialT2.parcialT2.models.Buy;
import com.parcialT2.parcialT2.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

@RestController
@RequestMapping("/api/v1/buy")
public class BuyController {
    @Autowired
    private BuyService buyService;

    @GetMapping("/all")
    public ResponseEntity <?> getPaymentDetail(){
        return ResponseEntity.ok(buyService.getBuyDetails());
    }

    /**
     * Saves a new purchase after validating the total amount.
     * @param buy The purchase object received in the request body.
     * @return ResponseEntity containing the saved purchase or an error message if validation fails.
     */
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Buy buy) {
        try{
            Map<String, String> mesage = new HashMap<>();
            Buy compraToSave = buyService.save(buy);
            mesage.put("mensaje", compraToSave.toString());
            mesage.put("status", "Aceptado");
            return ResponseEntity.ok(compraToSave);
        } catch (Exception e) {
            Map<String, String> error = new HashMap<>();
            error.put("message", e.getMessage());
            error.put("status", "Declinado");
            return ResponseEntity.badRequest().body(error);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable int id) {
        return ResponseEntity.ok(buyService.findById(id));
    }

}

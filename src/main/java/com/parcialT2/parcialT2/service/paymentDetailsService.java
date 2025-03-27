package com.parcialT2.parcialT2.service;

import com.parcialT2.parcialT2.models.PaymentDetails;
import com.parcialT2.parcialT2.repository.paymentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class paymentDetailsService {
    @Autowired
    private paymentDetailsRepository paymentDetailsRepository;

    public PaymentDetails save(PaymentDetails paymentDetails){
        Double TotalAmount = paymentDetails.getAmount() * paymentDetails.getPrice();
        paymentDetails.setTotalAmount(TotalAmount);
        return paymentDetailsRepository.save(paymentDetails);
    }

    public PaymentDetails findById(Integer id){
        return paymentDetailsRepository.findById(id).orElse(null);
    }
}

package com.parcialT2.parcialT2.service;

import com.parcialT2.parcialT2.models.PaymentDetails;
import com.parcialT2.parcialT2.repository.paymentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class paymentDetailsService {
    @Autowired
    private paymentDetailsRepository paymentDetailsRepository;

    public paymentDetail save(PaymentDetails paymentDetails){
        Double TotalAmount = paymentDetails.getAmount() * paymentDetails.getPrice();
        paymentDetails.setTotalAmount(TotalAmount);
        return paymentDetail.save(paymentDetails);
    }

    public paymentDetails findById(Integer id){
        return detallePagoRepository.findById(id).orElse(null);
    }
}

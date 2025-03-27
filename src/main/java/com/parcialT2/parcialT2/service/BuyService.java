package com.parcialT2.parcialT2.service;

import com.parcialT2.parcialT2.models.Buy;
import com.parcialT2.parcialT2.models.PaymentDetails;
import com.parcialT2.parcialT2.repository.buyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyService {

    @Autowired
    private buyRepository buyRepository;

    /**
     * Saves a purchase (Buy) after verifying the total amount.
     * @param buy The purchase object to be saved.
     * @return The saved Buy object.
     * @throws RuntimeException if the total amount does not match the sum of payment details.
     */
    public Buy save(Buy buy) {
        List<PaymentDetails> paymentDetailsList = buy.getPaymentDetails();
        Double total = buy.getTotal();
        Double calculatedTotal = 0.0;

        // Calculate the total amount from payment details
        for (PaymentDetails paymentDetails : paymentDetailsList) {
            calculatedTotal += paymentDetails.getTotalAmount();
        }

        // Verify if the calculated total matches the given total
        if (!calculatedTotal.equals(total)) {
            throw new RuntimeException("Incorrect total amount");
        }

        // Save the purchase in the repository
        return buyRepository.save(buy);
    }

    /**
     * Retrieves all purchase records
     * @return A list of all purchases.
     */
    public List<Buy> getBuyDetails() {
        return buyRepository.findAll();
    }

    /**
     * Finds a purchase by its ID
     * @param id The ID of the purchase.
     * @return The Buy object if found, otherwise null.
     */
    public Buy findById(int id) {
        return buyRepository.findById(id).orElse(null);
    }
}

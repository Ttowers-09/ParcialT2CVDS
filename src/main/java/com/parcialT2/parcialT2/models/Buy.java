package com.parcialT2.parcialT2.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "buys")
public class Buy {
    @Id
    private int IdBuy;
    private List<PaymentDetails> paymentDetails;
    private double total;

    /**
     * @param idBuy: Used to identify the buy
     * @param paymentDetails:Used to identify the payment details
     * @param total: Used to identify the total about amount and price
     */
    public Buy(int idBuy, List<PaymentDetails> paymentDetails, double total) {
        IdBuy = idBuy;
        this.paymentDetails = paymentDetails;
        this.total = total;
    }

    /**
     * method used to get the product buy Id
     * @return idBuy
     */
    public int getIdBuy() {
        return IdBuy;
    }

    /**
     * method used to set the product buy Id
     * @param idBuy
     */
    public void setIdBuy(int idBuy) {
        IdBuy = idBuy;
    }

    /**
     * method used to get the payment details
     * @return paymentdetails in form of list
     */
    public List<PaymentDetails> getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * method used to set the payment details
     * @param paymentDetails
     */
    public void setPaymentDetails(List<PaymentDetails> paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    /**
     *method used to get the total amount
     * @return total about the buy
     */
    public double getTotal() {
        return total;
    }

    /**
     * method used to set the total amount
     * @param total
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * The getters and setters methods were created automatically by
     * IntelliJ -> right click,
     * Generate -> getter and setters
     */
}

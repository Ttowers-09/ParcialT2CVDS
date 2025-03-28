package com.parcialT2.parcialT2.models;

import com.parcialT2.parcialT2.models.PaymentDetails;
import com.parcialT2.parcialT2.models.Product;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentDetailsTest {


    @Test
    public void testConstructorCalculatesTotalAmountCorrectly() {
        Product product = new Product("P001", "Laptop", 800.0);
        Date date = new Date();

        PaymentDetails payment = new PaymentDetails(1, product, 800.0, date, null, 2);

        assertEquals(1600.0, payment.getTotalAmount());
    }

    @Test
    public void testSetAndGetPrice() {
        PaymentDetails payment = createSamplePayment();
        payment.setPrice(120.0);
        assertEquals(120.0, payment.getPrice());
    }

    @Test
    public void testSetAndGetDate() {
        PaymentDetails payment = createSamplePayment();
        Date newDate = new Date(System.currentTimeMillis() - 100000);
        payment.setDate(newDate);
        assertEquals(newDate, payment.getDate());
    }

    @Test
    public void testSetAndGetProduct() {
        PaymentDetails payment = createSamplePayment();
        Product newProduct = new Product("P002", "Tablet", 500.0);
        payment.setProduct(newProduct);
        assertEquals("P002", payment.getProduct().getId());
    }

    @Test
    public void testSetTotalAmountManually() {
        PaymentDetails payment = createSamplePayment();
        payment.setTotalAmount(9999.0);
        assertEquals(9999.0, payment.getTotalAmount());
    }

    @Test
    public void testNegativePrice() {
        Product product = new Product("P003", "Negative Test", -50.0);
        Date date = new Date();

        PaymentDetails payment = new PaymentDetails(2, product, -50.0, date, null, 3);

        assertEquals(-150.0, payment.getTotalAmount());
    }

    @Test
    private PaymentDetails createSamplePayment() {
        Product product = new Product("P001", "Laptop", 800.0);
        return new PaymentDetails(1, product, 800.0, new Date(), null, 2);
    }
}

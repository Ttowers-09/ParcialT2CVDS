package com.parcialT2.parcialT2.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "paymentdetails")

public class PaymentDetails {
    @Id
    private Integer id;
    private Product product;
    private double price;
    private Date date;
    private Double totalAmount;
    private int amount;

    /**
     * @param id: Used to identify the Payment details
     * @param product: used to identify the product
     * @param price: used to knows the price
     * @param date: used to know the date when the payments do
     * @param totalAmount: used to knows the amount
     */
    public PaymentDetails(Integer id, Product product, double price, Date date, Double totalAmount, int amount) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.date = date;
        this.amount = amount;
        this.totalAmount = amount * price;

    }

    /**
     * method used to get the payment details Id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * methos used to set id about payment details
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * this method is used to get the product
     * @return product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * this method is used to set the product
     * @param product
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * this methos is used to get the price about the product
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * this method is used to set the price about the product
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * this method is used to get the date about payment
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * this method is used to set the date
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * this method is used to get the amount about the payment
     * @return totalAmount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * this method is used to set amount abput buy and final payment
     * @param totalAmount
     */
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTotalAmount(){
        return totalAmount;
    }
}


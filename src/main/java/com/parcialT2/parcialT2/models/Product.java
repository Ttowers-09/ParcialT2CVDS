package com.parcialT2.parcialT2.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/*
@Document is an annotation provided by Spring Data project. It is used to identify a
domain object that is persisted to MongoDB-
*/
@Document(collection = "product")
public class Product {
    @Id
    private String id;
    private String name;
    private double price;

    public Product() {

    }

    /**
     * @param id: Used to identify the product
     * @param name:  Used to identify the product with the name
     * @param price: Product Feature
     */
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * method used to get the product ID
     * @return id product
     */
    public String getId() {
        return id;
    }

    /**
     * method used to set the product ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * method used to get the product naem
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * method used to set the product name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method used to get the price
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * method used to set the product price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /*
    Translation made with google translate
     */
}


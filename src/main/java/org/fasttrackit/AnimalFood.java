package org.fasttrackit;

import java.time.LocalDate;

public class AnimalFood {
    private String name;
   private int price;
   private double quantity;
   private LocalDate expirationDate;
   private boolean availabilityInStock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isAvailabilityInStock() {
        return availabilityInStock;
    }

    public void setAvailabilityInStock(boolean availabilityInStock) {
        this.availabilityInStock = availabilityInStock;
    }

    public AnimalFood(String name){

    };


}

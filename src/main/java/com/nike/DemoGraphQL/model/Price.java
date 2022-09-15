package com.nike.DemoGraphQL.model;

public class Price
{
    public Price() {

    }

    double price;
    String currency;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Price{" +
                "price=" + price +
                ", currency='" + currency + '\'' +
                '}';
    }

    public Price(double price, String currency) {
        this.price = price;
        this.currency = currency;
    }
}

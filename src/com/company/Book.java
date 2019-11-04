package com.company;

// SKU	Title	Author	Description	Price

public class Book {
    private String SKU;
    private String Title;
    private String Author;
    private String Description;
    private double Price;
    private boolean isInStock;

    public Book() {
    }

    public Book(String SKU, String title, String author, String description, double price, boolean isInStock) {
        this.SKU = SKU;
        Title = title;
        Author = author;
        Description = description;
        Price = price;
        this.isInStock = isInStock;
    }

    public double total(double x){
        if(isInStock)
        {
            return this.Price;
        }
        else{
            System.out.println("*** sorry " + Title + " is out of stock ***\n");
            return 0;
        }
    }

    public void getDisplayText() {
        System.out.println("|| Title: " + Title + " || Written by: " + Author + "\n|| Description: " + Description + "\n");
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}

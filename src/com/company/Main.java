package com.company;

// A book database class will contain a method to return a book object.
// We haven't exactly learned how to create a database or read/write to files yet.
// We're going to use the knowledge we already have to create a class.
// Our class will simulate a database and return a populated book object.
// We'll simulate a database by simply using if or switch statements to look up a book based on SKU.
// Later, we'll create a database using Oracle that also returns a book object.
//
// Our book database will contain several book titles and the SKU code to look one up.
//
// Your assignment
// Create a class that contains a method that takes one parameter, the SKU, and returns a corresponding book object. Use If Statements to populate the instance variables of the Book class and return the populated Book class.
//
// Your database should contain the following books:

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList <Book> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        list.add(new Book("Java1001", "Head First", "Java Kathy Sierra and Bert Bates",
                "Easy to read Java workbook.", 47.50, false));
        list.add(new Book("Orcl1003", "Thinking in Java", "Bruce Eckel",
                "Details about Java under the hood.", 20.00, true));
        list.add(new Book("Orcl1003", "OCP: Oracle Certified Professional Java SE", "Jeanna Boyarsky",
                "Everything you need to know in one place.", 45.00, true));
        list.add(new Book("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart",
                "Fun with Python", 10.50, true));
        list.add(new Book("Zombie1005", "The Maker's Guide to the Zombie Apocalypse", "Simon Monk",
                "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50, true));
        list.add(new Book("Rasp1006", "Raspberry Pi Projects for the Evil Genius", "Donald Norris",
                "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, true));

        System.out.println("Enter SKU of desired book: ");
        String sku = key.nextLine();

        if(search(sku) != null){
            search(sku).getDisplayText();
        }
        else{
            System.out.println("Book could not be found.");
        }
    }

        public static Book search(String sku){
            for(Book b : list){
                if(b.getSKU().equalsIgnoreCase(sku)){
                    return b;
                }
            }
            return null;
        }

    }

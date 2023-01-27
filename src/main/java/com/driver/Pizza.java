package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";

    private int cheese;
    private int toppings;
    private int basePrice;

    boolean isExtraCheese;
    boolean isExtraToppings;
    boolean isTakeAway;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraCheese = false;
        this.isExtraToppings = false;
        this.isBillGenerated = false;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else{
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheese){
            this.price = this.price + cheese;
            this.isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppings){
            this.price = this.price + toppings;
            this.isExtraToppings = true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAway){
            this.price += 20;
            isTakeAway = true;
        }
    }

    public String getBill(){
        if(!isBillGenerated){
            if(isExtraCheese){
                this.bill += "Extra Cheese Added: " + this.cheese + "\n";
            }
            if(isExtraToppings){
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if(isTakeAway){
                this.bill += "Paperbag Added: " + 20 + "\n";
            }
                this.bill += "Total Price: " + this.price + "\n";
                this.isBillGenerated = true;
        }
        return this.bill;
    }
}

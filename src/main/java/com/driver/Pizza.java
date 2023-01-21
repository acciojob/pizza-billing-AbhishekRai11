package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int topping;
    private int cheese;
    boolean ischeese;
    boolean istooping;
    boolean istofar;
    boolean isbillgenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        bill="";
        if(isVeg){
            price=300;
            topping=70;

        }
        else{
            price=400;
            topping=120;
        }
        cheese=80;
        bill+="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ischeese){
            this.price=this.price+cheese;
            ischeese=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!istooping){
            this.price=this.price+topping;
            istooping=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!istofar){
            this.price=this.price+20;
            istofar=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isbillgenerated){
            if(ischeese){
                bill+="Extra Cheese Added: "+this.cheese+"\n";
            }
            if(istooping){
                bill+="Extra Toppings Added: "+this.topping+"\n";
            }
            if(istofar){
                bill+="Paperbag Added: 20"+"\n";
            }
            bill+="Total Price: "+this.price+"\n";
            isbillgenerated=true;
        }

        return this.bill;
    }
}

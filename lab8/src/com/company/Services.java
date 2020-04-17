package com.company;

public abstract class Services implements getInformation{

    protected String name;
    protected int price;
    protected int time;
    public void setName(){
        this.name=name;
    }
    public void setPrice(int price){
        if(price<0){
            throw new IllegalArgumentException("Цена не может быть отрицательной");
        }
        this.price=price;
    }
    public void setTime(int time){
        if(time<0){
            throw new IllegalArgumentException("Время не может быть отрицательным");
        }
        this.time=time;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public int getTime(){
        return this.time;
    }


}


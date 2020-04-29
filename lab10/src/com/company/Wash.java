package com.company;

public class Wash extends Services implements Iwash{
    protected String typeWashing;
    protected boolean isAutomatic;
    protected boolean isDryCleaning;
    Wash(String name, int price, int time,String typeWashing,boolean isAutomatic,boolean isDryCleaning){
        this.name=name;
        this.price=price;
        this.time=time;
        this.typeWashing=typeWashing;
        this.isAutomatic=isAutomatic;
        this.isDryCleaning=isDryCleaning;

    }
    Wash(){};
    public void setTypeWashing(String typeWashing){
        this.typeWashing=typeWashing;
    }
    public void setAutomatic(boolean isAutomatic){
        this.isAutomatic=isAutomatic;
    }
    public void setDryCleaning(boolean isDryCleaning){
        this.isDryCleaning=isDryCleaning;
    }
    public String getTypeWashing(){
        return this.typeWashing;
    }
    public boolean getIsAutomatic(){
        return this.isAutomatic;
    }
    public boolean getIsDryCleaning(){
        return this.isDryCleaning;
    }

    public String getTypeServices() {
        return "Wash";
    }
    public int getTotalCast() {
        return 500 + this.price;
    }
    public String toString() {
        String str = "";
        str = str + this.name + ", " + this.price + " рублей, " + this.time + "часов, " + this.typeWashing;
        if (this.isAutomatic) {
            str = str + " Автоматичсекая мойка ";
        } else {
            str = str + " Ручная мойка ";
        }
        if (this.isDryCleaning) {
            str = str + " Сухая мойка ";
        } else {
            str = str + " Влажная мойка ";
        }
        return str;
    }
    public String addTabStr() {
        String str="";
        str = "Мойка" + "\t"+ name + "\t" + price + "\t"+ time + "\t"+ typeWashing +"\t" +isAutomatic+"\t"+isDryCleaning;
        return str;
    }

    @Override
    public long getWashPrice() {
        return 1000;
    }
}

package com.company;

public class Maintenance extends Repair implements getInformation{
    Maintenance (String name, int price, int time,String typeRepair,String dificult,boolean isDetail,String typeMaintance,boolean isMaintanceFilter,int countPreviousMaintance){
        this.name=name;
        this.price=price;
        this.time=time;
        this.typeRepair=typeRepair;
        this.dificult=dificult;
        this.isDetail=isDetail;
        this.typeMaintance=typeMaintance;
        this.isMaintanceFilter=isMaintanceFilter;
        this.countPreviousMaintance=countPreviousMaintance;
    }
    protected String typeMaintance;
    protected boolean isMaintanceFilter;
    protected int countPreviousMaintance;

    public void setTypeMaintance(String typeMaintance){
        this.typeMaintance=typeMaintance;
    }
    public void setIsMaintanceFilter(boolean isMaintanceFilter){
        this.isMaintanceFilter=isMaintanceFilter;
    }
    public void setCountPreviousMaintance(int countPreviousMaintance){
        if(countPreviousMaintance<0){
        throw new IllegalArgumentException("Цена не может быть отрицательной");
        }
        this.countPreviousMaintance=countPreviousMaintance;
    }
    public String getTypeMaintance(){
        return this.typeMaintance;
    }
    public boolean getIsMaintanceFilter(){
        return this.isMaintanceFilter;
    }
    public int getCountPreviousMaintance(){
        return this.countPreviousMaintance;
    }
    public String getTypeServices() {
        return "Maintenance";
    }
    public int getTotalCast() {
        return 2000 + this.price;
    }
    public String toString() {
        String str = "";
        str = str + this.name + ", " + this.price + " рублей, " + this.time + "часов, " + this.typeRepair + "Сложность: " + this.dificult;
        if (this.isDetail) {
            str = str + " Требуются детали ";
        } else {
            str = str + " Не требуются детали";
        }
        str=str+" Тип мойки "+this.typeMaintance;
        if (this.isMaintanceFilter) {
            str = str + " Требуется замена фильтров ";
        } else {
            str = str + " Не требуется замена фильтров ";
        }
        str=str+" Количество предыдущих ТО "+this.countPreviousMaintance;
        return str;
    }
    public String addTabStr() {
        String str="";
        str = "Обслуживание" + "\t"+ name + "\t" + price + "\t"+ time + "\t"+ typeRepair +"\t" +dificult+"\t"+isDetail+"\t"+typeMaintance+"\t"+isMaintanceFilter+"\t"+countPreviousMaintance;
        return str;
    }
}

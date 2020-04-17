package com.company;

public class Diagnostic extends Repair implements getInformation{
    Diagnostic(String name, int price, int time,String typeRepair,String dificult,boolean isDetail,String typeDiagnostic,boolean isDiagnosticalTechics,boolean isDiagnosticalUrgent){
        this.name=name;
        this.price=price;
        this.time=time;
        this.typeRepair=typeRepair;
        this.dificult=dificult;
        this.isDetail=isDetail;
        this.typeDiagnostic=typeDiagnostic;
        this.isDiagnosticalTechics=isDiagnosticalTechics;
        this.isDiagnosticalUrgent=isDiagnosticalUrgent;
    }
    protected String typeDiagnostic;
    protected boolean isDiagnosticalTechics;
    protected boolean isDiagnosticalUrgent;
    public void setTypeDiagnostic(String typeDiagnostic){
        this.typeDiagnostic=typeDiagnostic;
    }
    public void setIsDiagnosticalTechics(boolean isDiagnosticalTechics){
        this.isDiagnosticalTechics=isDiagnosticalTechics;
    }
    public void setIsDiagnosticalUrgent(boolean isDiagnosticalUrgent){
        this.isDiagnosticalUrgent=isDiagnosticalUrgent;
    }
    public String getTypeDiagnostic(){
        return this.typeDiagnostic;
    }
    public boolean getIsAutomatic(){
        return this.isDiagnosticalTechics;
    }
    public boolean getIsDiagnosticalUrgent(){
        return this.isDiagnosticalUrgent;
    }

    public String getTypeServices() {
        return "Diagnostic";
    }
    public int getTotalCast() {
        return 1000 + this.price;
    }

    public String toString() {
        String str = "";
        str = str + this.name + ", " + this.price + " рублей, " + this.time + "часов, " + this.typeRepair + "Сложность: " + this.dificult;
        if (this.isDetail) {
            str = str + " Требуются детали ";
        } else {
            str = str + " Не требуются детали ";
        }
        str=str+" Тип диагностики "+this.typeRepair;
        if (this.isDiagnosticalTechics) {
            str = str + " Требуется техническое оборудование ";
        } else {
            str = str + " Не требуется техническое оборудование ";
        }
        if (this.isDiagnosticalUrgent) {
            str = str + " Срочная услуга ";
        } else {
            str = str + " Обычный приоритет";
        }
        return str;
    }
    public String addTabStr() {
        String str="";
        str = "Диагностика" + "\t"+ name + "\t" + price + "\t"+ time + "\t"+ typeRepair +"\t" +dificult+"\t"+isDetail+"\t"+typeRepair+"\t"+isDiagnosticalTechics+"\t"+isDiagnosticalUrgent;
        return str;
    }
}

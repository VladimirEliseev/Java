package com.company;

public abstract class Repair extends Services{

    protected String typeRepair;
    protected String dificult;
    protected boolean isDetail;
    public void setTypeRepair(String typeRepair){
        this.typeRepair=typeRepair;
    }
    public void setDificult(String dificult){
        this.dificult=dificult;
    }
    public void setIsDeatil(boolean isDetail){
        this.isDetail=isDetail;
    }
    public String getTypeRepair(){
        return this.typeRepair;
    }
    public String getDificult(){
        return this.dificult;
    }
    public boolean getIsDeatail(){
        return this.isDetail;
    }

}

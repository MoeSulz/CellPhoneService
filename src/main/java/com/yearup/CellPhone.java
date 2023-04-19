package com.yearup;

public class CellPhone {
    private double serialNumber;
    private String model;
    private String carrier;
    private String phoneNum;
    private String owner;
    private String dialCall;
    private String cellPhone2;



    public CellPhone(double serial, String model, String carrier, String phoneNum, String owner){
        this.serialNumber = serial;
        this.model = model;
        this.carrier = carrier;
        this.phoneNum = phoneNum;
        this.owner = owner;

    }
    public CellPhone(){

    }

    public double getSerial(){
        return this.serialNumber;
    }
    public void setSerial(double serialNumber){
        this.serialNumber = serialNumber;

    }

    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getCarrier(){
        return this.carrier;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }

    public String getPhoneNum(){
        return this.phoneNum;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }

    public String getOwner(){
        return this.owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }

    public void dial(String number){
        System.out.println(owner + "'s phone is calling " + number);
    }


}

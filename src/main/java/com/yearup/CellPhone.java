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

    public double getSerial(){
        return this.serialNumber;
    }
    public double setSerial(double serialNumber){
        this.serialNumber = serialNumber;
        return serialNumber;
    }

    public String getModel(){
        return this.model;
    }

    public String getCarrier(){
        return this.carrier;
    }

    public String getPhoneNum(){
        return this.phoneNum;
    }

    public String getOwner(){
        return this.owner;
    }
    public dial(String cellPhone2, String cellPhone1){
        this.cellPhone2 = cellPhone2;
        this.phoneNum = cellPhone1;
        


    }


}

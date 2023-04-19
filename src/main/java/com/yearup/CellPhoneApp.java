package com.yearup;

public class CellPhoneApp {
    public static void main(String[] args) {
        CellPhone num1 = new CellPhone(3728478, "iPhone", "Metro by T-Mobile", "347-785-7885", "Moe Sulz");

        num1 = new CellPhone(num1.getSerial(), num1.getModel(), num1.getCarrier(), num1.getPhoneNum(), num1.getOwner());
        System.out.println("Serial Number: " + num1.getSerial());
        System.out.println("Model: " + num1.getModel());
        System.out.println("Carrier: " + num1.getCarrier());
        System.out.println("Phone Number: " + num1.getPhoneNum());
        System.out.println("Owner: " + num1.getOwner());
    }

    public static void calls(String[] args) {

    }
}

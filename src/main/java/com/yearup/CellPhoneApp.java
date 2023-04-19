package com.yearup;

public class CellPhoneApp {
    public static void main(String[] args) {
        CellPhone num1 = new CellPhone(3728478, "iPhone", "Metro by T-Mobile", "347-785-7885", "Moe Sulz");
        CellPhone num2 = new CellPhone(738372,"Samsung", "Sprint", "347-457-3847", "Micheal Whoops");
        CellPhone num3 = new CellPhone();
        num3.setSerial(33939);
        num3.setModel("iPhone");
        num3.setCarrier("AT&T");
        num3.setPhoneNum("347-463-3738");
        num3.setOwner("New Name");

        display(num1);
        display(num2);
        display(num3);

        num1.dial(num2.getPhoneNum());
        num2.dial(num1.getPhoneNum());

    }
    public static void display(CellPhone phone){
        System.out.println("Serial Number: " + phone.getSerial());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNum());
        System.out.println("Owner: " + phone.getOwner());
    }
}

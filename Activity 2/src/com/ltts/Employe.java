package com.ltts;

import java.util.Scanner;

class Employe {
    String name, address, phone;

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
}

public class Main {

    public static void main(String[] args) {
        Employe e = new Employe();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        e.name = sc.nextLine();

        System.out.println("Enter address:");
        e.address = sc.nextLine();

        System.out.println("Enter mobile:");
        e.phone = sc.nextLine();

        System.out.println("Employee Details" + "\n" + "Name: " + e.getName() + "\n" + "Address: " + e.getAddress() + "\n" + "Mobile: " + e.getPhone());
    }

}
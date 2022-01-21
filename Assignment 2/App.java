package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter package: ");
        int packagenum = s.nextInt();

        System.out.println("Enter hours: ");
        double hours = s.nextDouble();

        double cost = 0;
        double charges = 0;
        if (packagenum == 1) {
            cost = 9.95;
            if (hours > 20) {
                hours = (hours - 20) * 3.00;
                charges = cost + hours;
            } else {
                charges = 9.95;
            }

        } else if (packagenum == 2) {
            cost = 14.95;
            if (hours > 30) {
                hours = (hours - 30) * 2.00;
                charges = cost + hours;
            } else {
                charges = 14.49;
            }

        } else {
            cost = 19.95;
            if (hours > 50) {
                hours = (hours - 50) * 1.00;
                charges = cost + hours;
            } else {
                charges = 19.95;
            }

        }

        System.out.println("Charges: $" + charges);
    }

}

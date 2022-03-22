/*
 * Author: Michael Rodriguez
 */
package com.mycompany.app_rodriguezmichael;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random r = new Random();

        //create random numbers and add to array
        double[] sales = new double[10];
        for (int i = 0; i < sales.length; i++) {
            sales[i] = r.nextInt(10001);
            //System.out.println(sales[i]); 
        }

		//Calculate commission rate via method
        arr commrate = calculateCommissionRate(sales);

        //calculate commission earned
        double[] com = new double[10];
        for (int i = 0; i < com.length; i++) {
            com[i] = sales[i] * commrate[i];
            //System.out.println(com[i]); 
        }

        //display amounts
        System.out.println("Sales Amount ($)\tCommission Rate (%)\tCommission ($)");
        for (int i = 0; i < sales.length; i++) {
            System.out.println(String.format("%.2f", sales[i]) + "\t\t\t" + String.format("%.1f", comrate[i] * 100) + "\t\t\t" + String.format("%.2f", com[i]));
        }

        //calculate maximum values in sales and commission arrays
		double maxSales = calculateMax(sales);
        double maxComm = calculateMax(comm);


        public static double calculateCommissionRate(double[] arr) {
        
            //determine commission rate
            double[] commrate = new double[10];
            for (int i = 0; i < commrate.length; i++) {
                if (sales[i] < 1000) {
                    commrate[i] = 0.05;
                } else if (sales[i] >= 1000 && sales[i] < 5000) {
                    commrate[i] = 0.1;
                } else {
                    commrate[i] = 0.15;
                }
            }
            return commrate[i];
        }
        
        
        public static double calculateMax(double[] args) {
           
            //calculate maximum value in array
            double max = sales[0];
    
            for (int i = 1; i < sales.length; i++) {
                if (sales[i] > max) {
                    max = sales[i];
                }
            }
            return max;
        }
        


}
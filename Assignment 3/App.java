/*
 * Author: Michael Rodriguez
 */

import java.util.Scanner;


public class Sales {

   int num=0;
   Scanner sc=new Scanner(System.in);
   private int getNoofSP(){
       System.out.println("Enter number of sales Persons:");
       int num1=sc.nextInt(); //read number of salespersons from users
       num=num1;
       return num;
      
   }
  
   private String[] getSP(){
       int num=getNoofSP();
       String[] sPersons=new String[num];
      
       //ask user to enter name of sales persons
       System.out.println("Enter names of sales Persons one by one:");
      
       for(int i=0;i<num;i++){
           sPersons[i]=sc.nextLine();
           sc.nextLine();
       }
      
       return sPersons;
   }
  
   private int[] getSales(){
      
       int sales[]=new int[num];
      
       //ask user to enter sales amount of sales persons
       System.out.println("Enter sales amount for each sales person");
       for(int i=0;i<num;i++){
           sales[i]=sc.nextInt();
          
           //continue asking until positive value is enetered
           while(sales[i]<0){
               System.out.println("Enter positive value");
               sales[i]=sc.nextInt();
           }
       }
      
       return sales;
   }
  
   private double[] calculateCommision(){
      
      
      
       int[] sales=getSales();
       double[] comm=new double[num];
      
       for(int i=0;i<num;i++){
           if(sales[i]<2000){
               //5% commission
               comm[i]=(sales[i]*5)/100.00;
              
           }
           else if(sales[i]>2000 && sales[i]<5000){
               //10% commission
               comm[i]=(sales[i]*10)/100.00;
           }
           else if(sales[i]>5000){
               //20% commission
               comm[i]=(sales[i]*20)/100.00;
           }
          
          
       }
       return comm;
   }
  
   private int calculateTotalSales(){
      
       int[] sales=getSales();
       int sum=0;
       for(int i=0;i<num;i++){
           sum+=sales[i];
       }
      
       return sum;
   }
   private double calculateAvgSales(){
      
       int sum=calculateTotalSales();
       double avg=(double)sum/num;
      
       return avg;
   }
  
   private double calculateTotalComission(){
       double[] sales=calculateCommision();
       double sum=0.0;
       for(int i=0;i<sales.length;i++){
           sum+=sales[i];
       }
      
       return sum;
   }
  
  
   private void printSalesInfo(){
      
       String[] persons=getSP();
       int[] sales=getSales();
       double[] comm=calculateCommision();
      
       System.out.println("SalesPerson\t\t SalesAmount\t\t Commisiion");
      
       for(int i=0;i<sales.length;i++){
          
           System.out.println(persons[i]+"\t\t "+sales[i]+"\t\t "+comm[i]);
       }
   }
  
   private double getCommision(String person){
       String[] persons=getSP();
      
       double[] comm=calculateCommision();
      
       for(int i=0;i<persons.length;i++){
           if(persons[i].equals(person)){
               return comm[i];
           }
       }
      
       System.err.println(person+" does not exists");
       return 0.0;
   }

}
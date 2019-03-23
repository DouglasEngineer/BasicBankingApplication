/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.application;

import java.util.Scanner;

/**
 *
 * @author DouglasD
 */
public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    public BankAccount(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }
    
    
    
    void deposit(int amount){
        if(amount != 0){
            balance += amount;
            previousTransaction = amount;
        }
    }
    
    void withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }
    
    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposition: " + previousTransaction);
        }else if(previousTransaction < 0){
            System.out.println("Withdraw: " + Math.abs(previousTransaction));
        }else{
            System.out.println("No transaction occured");
        }
    }
    
    void showMenu(){
        char option = '\0';
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Daneel Banking World: " + customerName);
        System.out.println("Your banking ID is the following: " + customerID);
        System.out.println("A: Check Balance");
        System.out.println("B: Deposit");
        System.out.println("C: Withdraw");
        System.out.println("D: Previous Transaction");
        System.out.println("E: Exits");
        
        do{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Enter an option.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            option = scan.next().charAt(0);
            System.out.println("\n");
            
            switch(option){
                case 'A':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Balance = "+balance);  
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("\n");
                    break;
               case 'B':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Enter an amount to deposit:");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                    int amountToDeposit = scan.nextInt();
                    deposit(amountToDeposit);
                    System.out.println("\n");
                    break;
               case 'C':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Enter an amount to withdraw:");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                    int amountToWithdraw = scan.nextInt();
                    withdraw(amountToWithdraw);
                    System.out.println("\n");
                    break;
               case 'D':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                    getPreviousTransaction();            
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("\n");
                    break;  
               case 'E':
                   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                   break;
                   
                default:
                    System.out.println("Invalid option, please try a new option or us capital letters.");
                    break;
            }
        }while (option != 'E');
        System.out.println("Thanks for using our service");
        
        
    }
}

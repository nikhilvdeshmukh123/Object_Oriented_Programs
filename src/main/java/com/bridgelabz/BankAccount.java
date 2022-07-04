package com.bridgelabz;
/*
 * @author: Nikhil Deshmukh
 * Managing Bank Account
 */
import java.util.Scanner;

public class BankAccount {
    // Scanner for user Input
    static Scanner scanner = new Scanner(System.in);
    private double balance;

    // Storing Initial Balance
    public BankAccount(double intialBalance) {
        balance = intialBalance;
    }

    // Method to debit ammount
    public void debit(double balance) {
        System.out.println("enter ammount to withdraws");
        double withdraw = scanner.nextDouble();
        // checking Balanxe with withdraw amount
        if (withdraw > balance)
            System.out.println("Debit amount exceeded account balance");
        else
            balance = balance - withdraw;
        System.out.println("Remaining balance is " + balance);
    }

    // Method to deposit amount
    public void deposit(double depositAmount) {
        balance = depositAmount;
    }

    public boolean withdraw(double withdrawAmount) {
        if (withdrawAmount > balance) {
            System.out.println("Insufficient Funds");
            return false;
        } else {
            balance = withdrawAmount;
            return true;
        }
    }

    // Main Method
    public static void main(String[] args) {
        System.out.println("Enter the balance to mention in the account");
        // Creating Object of BankAccount Class
        BankAccount account = new BankAccount(scanner.nextDouble());
        account.debit(account.balance);
    }
}
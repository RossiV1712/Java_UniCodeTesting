package com.Bank;

public class Main {

    public static void main(String[] args) {
        BankAccount P1 = new BankAccount(1234); // Create the object
        System.out.println("P1 - " + P1.getBalance()); // Display balance
        P1.deposit(13.5); // Deposit 13.5 into P1
        System.out.println("P1 - " + P1.getBalance()); // Display balance
        P1.withdraw(12.45); // Withdraw 12.45 from P1
        System.out.println("P1 - " + P1.getBalance()); // Display balance

        BankAccount P2 = new BankAccount(5678);
        P2.deposit(56.8); // Deposit 56.8 into P2
        System.out.println("P2 - " + P2.getBalance()); // Display balance
        P2.transfer(23.2, P1); // Transfer 23.2 from P2 to P1

        System.out.println("P2- " + P2.getBalance()); // Display balance
        System.out.println("P1- " + P1.getBalance()); // Display balance
    }
}
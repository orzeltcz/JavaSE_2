package com.infoshareacademy;

public class Account {
    private String number;
    private String owner;
    private int balance;
    public Account(){
        this.setBalance(1000000);
    }
    public void show(){
        System.out.println("Saldo konta: "+ this.getBalance());
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

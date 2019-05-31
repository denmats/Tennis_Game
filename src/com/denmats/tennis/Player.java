package com.denmats.tennis;

public class Player {
    protected String name = "Player";
    protected int balance = 0;
    public int counter = 0;

    public Player(){}

    public Player(String name){
        this.setName(name);
    }

    public Player(String name, int balance, int counter){
        this.setName(name);
        this.setBalance(balance);
        this.counter = counter;
    }


    public int getPoint(){
        return ++counter;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
}

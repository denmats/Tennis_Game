package com.denmats.tennis;

public class Game {

    public static void main(String[] args){
        Player server = new Player("Server");
        Player receiver = new Player("Receiver");
        Tracking.startGame(server,receiver);
    }
}

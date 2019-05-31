package com.denmats.tennis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tracking {
    public static Scanner sc = new Scanner(System.in);
    public static boolean flag = false;


    public static void startGame(Player p1, Player p2) {
        while (true) {
            if (getResult(p1, p2) == true) {
                System.out.println("Game over");
                break;
            }
        }
    }

    public static void getScore(Player p1, Player p2) {
        switch (p1.counter) {
            case 1:
                p1.setBalance(15);
                break;
            case 2:
                p1.setBalance(30);
                break;
            case 3:
                p1.setBalance(40);
                break;
            case 4:
                if (p2.getBalance() == 'A') {
                    p2.setBalance(40);
                    p1.counter --;
                } else if (p2.getBalance() == 40 && p1.getBalance() != 'A') {
                    p1.setBalance('A');
                    p1.counter --;
                } else if(p1.getBalance() == 'A' || p2.getBalance() < 40){
                    System.out.printf("%s wins the game \n", p1.getName());
                    flag = true;
                }
                break;
        }
    }


    public static boolean getResult(Player pServer, Player pReceiver) {
        System.out.println("============= TOTAL SCORE ==============");
        System.out.println("Server = 1");
        System.out.println("Receiver = 2");
        System.out.println("Please enter the player that wins the point: ");

        int userInput = checkUserInput();

        switch (userInput) {
            case 1:
                System.out.println("Server wins a point");
                pServer.getPoint();
                getScore(pServer, pReceiver);
                if(flag == false){
                    char tmp;
                    if(pServer.getBalance() == 'A'){
                        tmp = (char) pServer.getBalance();
                        System.out.printf("%s ["+tmp+" : ",pServer.getName());
                        System.out.printf("%d] %s \n",pReceiver.getBalance(), pReceiver.getName());
                    }else if(pReceiver.getBalance() == 'A'){
                        tmp = (char) pReceiver.getBalance();
                        System.out.printf("%s [%d" + " : ", pServer.getName(), pServer.getBalance());
                        System.out.printf(tmp+"] %s \n", pReceiver.getName());
                    }else{
                        System.out.printf("%s [%d" + " : ", pServer.getName(), pServer.getBalance());
                        System.out.printf("%d] %s " + "\n", pReceiver.getBalance(), pReceiver.getName());
                    }
                }
                break;
            case 2:
                System.out.println("Receiver wins a point");
                pReceiver.getPoint();
                getScore(pReceiver, pServer);
                if(flag == false){
                    char tmp;
                    if(pServer.getBalance() == 'A'){
                        tmp = (char) pServer.getBalance();
                        System.out.printf("%s ["+tmp+" : ", pServer.getName());
                        System.out.printf("%d] %s \n", pReceiver.getBalance(), pReceiver.getName());
                    }else if(pReceiver.getBalance() == 'A'){
                        tmp = (char) pReceiver.getBalance();
                        System.out.printf("%s [%d" + " : ", pServer.getName(), pServer.getBalance());
                        System.out.printf(tmp+"] %s \n", pReceiver.getName());
                    }else{
                        System.out.printf("%s [%d" + " : ", pServer.getName(), pServer.getBalance());
                        System.out.printf("%d] %s " + "\n", pReceiver.getBalance(), pReceiver.getName());
                    }
                }
                break;
            default:
                System.out.println("Do just correct choice: 1 (Server) or 2 (Receiver)\n");
                break;
        }
        return flag;
    }


    public static int checkUserInput() {
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            sc.next();
            System.out.println("Entered number is not integer");
            return -1;
        } catch (Exception e) {
            System.out.println("Something went wrong ...");
            return -1;
        }
    }
}

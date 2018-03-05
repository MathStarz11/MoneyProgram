package com.christodd;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> transaction = new ArrayList<>();
    public static ArrayList<Integer> feeling = new ArrayList<>();
    public static void main(String[] args) {
	// write your code here
        inputTransaction(5, -1);
        inputTransaction(100, 1);
        inputTransaction(50, 0);
        inputTransaction(54, 0);
        inputTransaction(10, 1);
        inputTransaction(28, -1);


        for(int i = 0; i < transaction.size(); i++) {
            if(feeling.get(i) == -1) {
                System.out.println("The " + transaction.get(i) + " dollar transaction I was not happy about");
            } else if (feeling.get(i) == 0) {
                System.out.println("The " + transaction.get(i) + " dollar transaction I was 50/50");
            } else { //feeling.get(i) == 1
                System.out.println("The " + transaction.get(i) + " dollar transaction I was super excited when I bought this purchase");
            }
        }
        System.out.println("..........");
        editTransaction(0, 8);
        editFeeling(1,0);

        for(int i = 0; i < transaction.size(); i++) {
            if(feeling.get(i) == -1) {
                System.out.println("The " + transaction.get(i) + " dollar transaction I was not happy about");
            } else if (feeling.get(i) == 0) {
                System.out.println("The " + transaction.get(i) + " dollar transaction I was 50/50");
            } else { //feeling.get(i) == 1
                System.out.println("The " + transaction.get(i) + " dollar transaction I was super excited when I bought this purchase");
            }
        }


    }

    public static void inputTransaction(int x, int y) {
        transaction.add(x);
        feeling.add(y);
    }

    public static void editTransaction(int x, int y) {
        transaction.set(x, y);
    }

    public static void editFeeling(int x, int y) {
        feeling.set(x, y);
    }

}

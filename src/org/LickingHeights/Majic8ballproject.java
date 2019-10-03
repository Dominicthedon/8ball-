package org.LickingHeights;

import java.util.Scanner;

public class Majic8ballproject {
    public static void main(String[] args) {
        //code goes here
        Scanner keyboard;
        int firstNumber;
        String question;
        keyboard = new Scanner(System.in);
        System.out.println("Welcome to your Majic 8-Ball");
        System.out.println("Please pick a number 1-100");
        firstNumber= keyboard.nextInt();
        if (10 >= firstNumber && firstNumber > 0) {
            System.out.println("Yes");
        }
        else if (20 >= firstNumber && firstNumber > 10) {
            System.out.println("Most likely no");
        }
        else if (30 >= firstNumber && firstNumber > 20) {
            System.out.println("As I see it yes");
        }
        else if (40 >= firstNumber && firstNumber > 30) {
            System.out.println("Outlook Not so good");
        }
        else if ( 50 >= firstNumber && firstNumber > 40) {
            System.out.println("NO");
        }
        else if (60 >= firstNumber && firstNumber > 50) {
            System.out.println("This will happen to you soon");
        }
        else if (70 >= firstNumber && firstNumber > 60) {
            System.out.println("My sources say no");
        }
        else if (80 >= firstNumber && firstNumber > 70) {
            System.out.println("As I see it,yes");
        }
        else if (90 >= firstNumber && firstNumber > 80) {
            System.out.println("Dont count on it");
        }
        else if (100 >= firstNumber && firstNumber > 90) {
            System.out.println("Very doubtful");
        }
        else if (10000000 >= firstNumber && firstNumber > 100) {
            System.out.println("YOU ARE A DISGRACE TO HUMANITY I SAID 1-100");
        }















































































































































































    }
        }




































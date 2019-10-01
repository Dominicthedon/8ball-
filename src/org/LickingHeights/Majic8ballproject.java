package org.LickingHeights;

import java.util.Scanner;

public class Majic8ballproject {
    public static void main(String[] args) {
        //code goes here
        Scanner keyboard;
        int firstNumber;
        String question;
        keyboard = new Scanner(System.in);
        System.out.println("Please pick a number 1-100");
        firstNumber= keyboard.nextInt();
        if (10 >= firstNumber && firstNumber > 0) {
            System.out.println("Yes");
        }
        if (20 >= firstNumber && firstNumber > 10) {
            System.out.println("Most likely no");
        }
        if (30 >= firstNumber && firstNumber > 20) {
            System.out.println("As I see it yes");
        }
        if (40 >= firstNumber && firstNumber > 30) {
            System.out.println("Outlook Not so good");
        }
        if ( 50 >= firstNumber && firstNumber > 40) {
            System.out.println("NO");
        }
         





            }
        }




































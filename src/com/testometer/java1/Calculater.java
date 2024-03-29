package com.testometer.java1;


import java.util.Scanner;

public class Calculater {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select the calculation type to be performed");
        char value = sc.next().charAt(0);

        System.out.println("Enter number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        switch (value)
        {
            case'+':
                System.out.println("Total ="+num1+num2);
                break;
            case '-':
                System.out.println("Total ="+(num1-num2));
                break;
            case '*':
                System.out.println("Total ="+num1*num2);
                break;
            case '/':
                System.out.println("Total ="+num1/num2);
                break;
            default:
                System.out.println("Invalid operator");
        }




        }


    }


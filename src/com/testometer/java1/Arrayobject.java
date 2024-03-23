package com.testometer.java1;

public class Hello {
    public static void main(String[] args) {
        //array practice problem

        String [] cars = new String[4];
        cars[0]= "honda";
        cars[1]= "hero";
        cars[2]= "yamaha";
        cars[3]= "tvs";

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);

        for (int i =0;i< cars.length;i++)
        {
            System.out.print(cars[i]);
        }


    }
}

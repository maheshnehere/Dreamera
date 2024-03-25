package com.testometer.java1;

public class Arrayobject {
    public static void main(String[] args) {
        //array practice problem

        String[] cars = new String[4];
        cars[0] = "honda";
        cars[1] = "hero";
        cars[2] = "yamaha";
        cars[3] = "tvs";

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);

        for (String car : cars) {
            System.out.print(car);
        }

        int[] numbers = new int[4];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;

        for(int num : numbers)
        {
            System.out.println(num);
        }

        boolean [] theory = new boolean[2];
        theory[0]  = true;
        theory[1] = false;

        for (boolean b : theory) {
            System.out.println(b);
        }

        float [] currency = new float[3];
        currency[0]=1.0f;
        currency[1]=3.4f;
        currency[2]=5.0f;

        for (int i = 0;i< currency.length;i++)
        {
            System.out.println(currency[i]);
        }
    }
}

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

        boolean [] theory = new boolean[3];
        theory[0]  = true;
        for (int j = 1; j < 3; j++) {
            theory[j] = false;
        }

        for (int i =0;i< theory.length;i++)
        {
            System.out.println(theory[i]);
        }
    }
}

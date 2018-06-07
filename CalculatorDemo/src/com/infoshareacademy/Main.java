package com.infoshareacademy;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc);
        System.out.println(calc.substract(3, 4));
        int a = 6;
        int b = 100;
        int c = 5;
        if (a > b && b + c < 5) {
            System.out.println("Pies");
        } else {
            System.out.println("Kot");
        }
        do {
            System.out.println("Spoon");
            b = b + 1;
        } while (a > b);
        for(int i=0;i<=10;i+=2){
            System.out.println(i);
        }
        for(int i=0;i<=20;i++){
            if(i==7 || i==13) continue;
                System.out.println(i);
        }

        String first= "macOS";
        String secound= "macOS";
        if(first==secound){
            System.out.println("Linux");
        }
    }
}

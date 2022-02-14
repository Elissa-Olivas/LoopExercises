package com.company;


public class Main {

    public static void main(String[] args) {
    boolean isNotFound = true;

        for (int num = 1; isNotFound; num++) {
            if ( num % 1 == 0 && num % 2==0 && num % 3==0 && num % 4==0 && num % 5==0) {
                System.out.println(num);
                isNotFound = false;
            }
        }
    }
}
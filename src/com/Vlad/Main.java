package com.Vlad;

public class Main {

    public static void main(String[] args) {

        System.out.print("The sum of your number's digits is: ");
        System.out.print(sumDigits(32165498));

    }

    public static int sumDigits(long a) {
        if (a < 0) {
            return -1;
        }
        int sum = 0;
        while (a > 0) {
            long x = a % 10;
            sum += x;
            a = a / 10;
        }
        return sum;
    }
}

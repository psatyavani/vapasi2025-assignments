package com.thoughtworks.exceptions;

import java.util.Scanner;

public class MyCalculationApp {
public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Calculator cal=new Calculator();

        System.out.println("Input number:");
        int input= scanner.nextInt();
        try {
        double result = cal.caldouble(input);
        System.out.println("Calculated result:"+result) ;
    } catch (MyArithmeticException e) {
        throw new RuntimeException(e);
    }
        finally{
        scanner.close();
    }
  }
}

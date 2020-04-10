package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("Draw the triangle");
        System.out.println("Draw the square");
        System.out.println("Draw the rectangle");
        System.out.println("Exit");
        System.out.println("Enter your choice:");
        int choice;

        choice=input.nextInt();



            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******* ");
                    System.out.println("****** ");
                    System.out.println("*****   ");
                    System.out.println("****   ");
                    System.out.println("***   ");
                    System.out.println("**   ");
                    System.out.println("*   ");
                    System.out.println("   ");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("enter your choice");


            }




    }
}

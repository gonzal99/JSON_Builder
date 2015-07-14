package com.company;

import java.util.Scanner;

/**
 * Created by gonzal99 on 7/14/2015.
 */
public class InformationInputer {
    Scanner scanner;

    public InformationInputer(){
        scanner = new Scanner(System.in);
        String name = reqName();
    }
    private String reqName(){
        int flag = 0;
        int exit = 1;
        String name;
        while(flag == 0) {
            System.out.println("Please enter the name of the project: ");
            name = scanner.next();
            System.out.println("Is " + name + " correct?");
            String response = scanner.next().toUpperCase();
            while (exit == 1) {
                switch (response) {
                    case "y":
                        return name;
                    case "n":
                        System.out.println("Try again.");
                        exit = 0;
                    default:

                }
            }
        }
    }
}

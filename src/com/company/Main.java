package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userQuestion = "";

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What kind of programming question would you like to ask the Rubber Duck program");
        userQuestion = myScanner.nextLine();

        if (userQuestion.length() < 200) {
            System.out.println("Ask a better question?");
        } else if (userQuestion.length() > 500) {
            System.out.println("Simplify your question!");
        } else if (userQuestion.length() >= 200 && userQuestion.length() <= 500){
            System.out.println("Quack!  Quack!");
        }
    }
}

package edu.whccd.evaldez;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String firstName = "";
    String lastName = "";
    String gender = "";
    Integer birthYear = 0;
    String[] questions = new String[10];
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

        while (firstName == "")
        {
            System.out.print("Enter first name: ");
            firstName = sc.next();
        }
        if (firstName != "")
        {
            System.out.print("Enter last name: ");
            lastName = sc.next();
        }

        if (lastName != "" && birthYear == 0)
        {
            System.out.print("Enter your year of birth: ");
            birthYear = sc.nextInt();
        }

        if (birthYear != 0)
        {
            System.out.print("What is your Gender?: ");
            gender = sc.next();
        }

        do
        {
            System.out.print("Question 1 ");
            questions[0] = sc2.nextLine();
        }
        while(questions[0]=="");

        do
        {
            System.out.print("Question 2 ");
            questions[1] = sc2.nextLine();
        }while (questions[1] == "");

        do
        {
            System.out.print("Question 3 ");
            questions[2] = sc2.nextLine();
        }
        while (questions[2] == "");

        do
        {
            System.out.print("Question 4 ");
            questions[3] = sc2.nextLine();
        }
        while (questions[3] == "");

        do
        {
            System.out.print("Question 5 ");
            questions[4] = sc2.nextLine();
        }
        while (questions[4] == "");

        do
        {
            System.out.print("Question 6 ");
            questions[5] = sc2.nextLine();
        }
        while (questions[5] == "");

        do
        {
            System.out.print("Question 7 ");
            questions[6] = sc2.nextLine();
        }
        while (questions[6] == "");

        do
        {
            System.out.print("Question 8 ");
            questions[7] = sc2.nextLine();
        }
        while (questions[7] == "");

        do
        {
            System.out.print("Question 9 ");
            questions[8] = sc2.nextLine();
        }
        while (questions[8] == "");

        do
        {
            System.out.print("Question 10 ");
            questions[9] = sc2.nextLine();
        }
        while (questions[9] == "");

        System.out.print(
                firstName + " " + lastName + "\n" +
                gender + "\n" +
                birthYear + "\n");
        for ( int i = 0; i <= questions.length-1; i++)
        {
            System.out.println(questions[i]);
        }
    }
}

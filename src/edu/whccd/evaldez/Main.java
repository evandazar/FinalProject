package edu.whccd.evaldez;

import com.sun.jdi.IntegerType;

import java.time.LocalDateTime;

import java.util.ArrayList;

import java.util.Collections;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    The purpose of this application is to show what I have learned from this course.
    Author: Evander Valdez
*/

public class Main {

    static String genderReformat(String gender)
    {
       String genderFormat = "";
       if (gender.equalsIgnoreCase("m"))
       {
           genderFormat = "Male";
       }
       else if (gender.equalsIgnoreCase("f"))
       {
           genderFormat = "Female";
       }
       else
       {
           genderFormat = "Other";
       }
       return genderFormat;
    }

    static int subYear(int birthYear, int age)
    {
    //Subtract the current year by the users age
        {
            age = LocalDateTime.now().getYear() - birthYear;
        }
        return age;
    }

    static boolean genderValid(String gender)
    {
    //Validate the users input on the gender question by checking whether their input was "m", "f", or "o"
        boolean output = false;
        if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f")||gender.equalsIgnoreCase("o"))
        {
            output = true;
        }
        {
            return output;
        }
    }

    public static void main(String[] args) {
    //Initialize Variables
    String firstName = "";
    String lastName = "";
    String gender = "";
    String genderExpand = "";
    Integer birthYear = 0;
    Integer age = 0;
    boolean genderValidate = false;
    String[] questions = new String[10];
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    //Get information on the user
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

        while (lastName != "" && birthYear == 0)
        {
            try {
                System.out.print("Enter your year of birth: ");
                birthYear = sc.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Invalid Input");
                sc.nextLine();
                continue;
            }
        }

        if (birthYear != 0)
        do {
            System.out.print("What is your Gender? (M/F/O): ");
            gender = sc.next();
            genderValidate = genderValid(gender);
        } while (!genderValidate);

    //Ask the user some questions
        do
        {
            System.out.print("What did you do this morning? ");
            questions[0] = sc2.nextLine();
        }
        while(questions[0]=="");

        do
        {
            System.out.print("What did you have for breakfast? ");
            questions[1] = sc2.nextLine();
        }while (questions[1] == "");

        do
        {
            System.out.print("What kind of car do you drive? ");
            questions[2] = sc2.nextLine();
        }
        while (questions[2] == "");

        do
        {
            System.out.print("How was your afternoon? ");
            questions[3] = sc2.nextLine();
        }
        while (questions[3] == "");

        do
        {
            System.out.print("What did you have for lunch? ");
            questions[4] = sc2.nextLine();
        }
        while (questions[4] == "");

        do
        {
            System.out.print("Where do you live? ");
            questions[5] = sc2.nextLine();
        }
        while (questions[5] == "");

        do
        {
            System.out.print("What did you eat for dinner? ");
            questions[6] = sc2.nextLine();
        }
        while (questions[6] == "");

        do
        {
            System.out.print("Do you get enough sleep? ");
            questions[7] = sc2.nextLine();
        }
        while (questions[7] == "");

        do
        {
            System.out.print("What is your routine before you go to bed? ");
            questions[8] = sc2.nextLine();
        }
        while (questions[8] == "");

        do
        {
            System.out.print("How was your day? ");
            questions[9] = sc2.nextLine();
        }
        while (questions[9] == "");

        age = subYear(birthYear, age);
        genderExpand = genderReformat(gender);
        System.out.print(
        firstName + " " + lastName + "\n" +
        genderExpand + "\n" +
        age + "\n");

        for ( int i = 0; i <= questions.length-1; i++)
        {
            System.out.println(questions[i]);
        }
    }
}

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

    //Validate the response.
    static String responseValid(String question)
    {
        String response = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(question);
            response = sc.nextLine();
        } while (response == "");
        return response;
    }

    //reformat the gender variable from "m", "f", and "o" to "male", "female", and "others"
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
    int count = 1;
    ArrayList<String>question = new ArrayList<String>();
    ArrayList<String>response = new ArrayList<String>();
    boolean genderValidate = false;
    Scanner sc = new Scanner(System.in);
    //Scanner sc2 = new Scanner(System.in);

    //add in the questions to the ArrayList
    question.add("What did you do this morning? ");
    question.add("What did you have for breakfast? ");
    question.add("What kind of car do you drive? ");
    question.add("How was your afternoon? ");
    question.add("What did you have for lunch? ");
    question.add("Where do you live? ");
    question.add("What did you eat for dinner? ");
    question.add("Do you get enough sleep? ");
    question.add("What is your routine before you go to bed? ");
    question.add("How was your day? ");

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
        for (String questionCheck: question)
        {
            response.add(responseValid(questionCheck));
        }

        //Display the users info
        age = subYear(birthYear, age);
        genderExpand = genderReformat(gender);
        System.out.print(
        "Name: " + firstName + " " + lastName + "\n" +
        "gender: " + genderExpand + "\n" +
        "age: " + age + "\n");

        //Displays the users responses
         /*for (String responses : response)
        {
             System.out.println(responses);
        }*/
        for (int i = 0; i < question.size(); i++)
        {
            System.out.println(count + ". " + question.get(i));
            System.out.println(response.get(i));
            count++;
        }
    }
}

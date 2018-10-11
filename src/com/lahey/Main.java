package com.lahey;
import java.util.Scanner;

/**
 * @author Jack Lahey
 *
 * Assignment
 * You will be creating an interactive chat-bot type program.
 * Eliza is a therapist program that interacts with the user.
 * Your program will need to evaluate what the user asks
 * and turn the user's input into a question that sounds like
 * the therapist really cares.
 *
 * Simple Eliza
 * our first task is to develop a program with a running loop.
 * If the user types in "I am feeling great" or enter "Q",
 * the program will stop running. Your program should print out
 * the last input (as an output) every time before accepting new
 * input. Make sure you are accommodating for NO case-sensitivity.
 * (Q is the same as q)
 *
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        String sInputString = "";
        String sQuitString = "I am feeling great";
        String sQuitQ   = "Q";

        System.out.print("Good day. What is your problem? ");

        do{
            System.out.print("Enter your response here or Q to quit: ");
            sInputString = scanInput.nextLine();

            System.out.println(sInputString);

        }while( !(sInputString.equalsIgnoreCase(sQuitString)) && !(sInputString.equalsIgnoreCase(sQuitQ)));

    }//end public static void main(String[] args)
}

/*You will be creating an interactive chat-bot type program. Eliza is a therapist program that interacts with
    the user. Your program will need to evaluate what the user asks and turn the user's input into a question that
    sounds like the therapist really cares.

    Your first task is to develop a program with a running loop. If the user types in "I am feeling great" or enter
    "Q", the program will stop running. Your program should print out the last input (as an output) every time
    before accepting new input. Make sure you are accommodating for NO case-sensitivity. (Q is the same as q)

    We will continue to build on top of this application throughout the week.*/

import java.util.Scanner;
public class SimpleEliza {

    public static void main (String[] args) {

        String question;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello! What's your deal? Enter a response below or enter Q to quit: ");
        question = keyboard.nextLine();

        //System.out.println("Hello! What's your deal?: ");
        //question = keyboard.nextLine();


        //while ((!question.equalsIgnoreCase("q") || !question.equalsIgnoreCase("i am feeling great")))


        while ((!question.equalsIgnoreCase("q") && !question.equalsIgnoreCase("i am feeling great"))) {
            System.out.println(question + "?");
            question = keyboard.nextLine();

//            if (!question.equalsIgnoreCase("I am feeling great")) {
//               System.out.println(question);
//               question = keyboard.nextLine();
//            {
            }

            System.out.println("Thanks for visiting. Hope it goes well.");
        }

    }









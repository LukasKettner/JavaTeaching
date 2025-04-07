package Lessons;

import com.sun.source.tree.WhileLoopTree;

public class Lesson2 {
    public static void run(){
        // BEFORE STARTING, curly brackets are used to denote the "body" of code, think of these curly brackets as a hamburger, all the code you write is whats between the buns


        //If we want to make the computer do something multiple times we are going to want to use a loop

        // ill show you why, what looks easier
        System.out.println("Not using a loop:");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");

        // Dividing line for your viewing pleasure
        System.out.println("--------------------");

        // or we can use a for loop
        System.out.println("Using a loop :");
        for(int i =1; i <6; i++){
            System.out.println(i);
        }
        // Dividing line for your viewing pleasure
        System.out.println("--------------------");
        // Standard building for a for loop looks like this:
        // for (int i = STARTING POINT; i < ENDING POINT; i++) {body}
        // We use an int i as an iterator

        // the first condition is setting i as an iterator and setting it equal to our starting point and ends wih a semi colon
        // the second line is stating the condition for which our loop will continue, so while i is less than our ending point, keep going
        // the last line simply says that after your done with the loop, increase i by one;

        // we can also use outside variables for these For example:
        int start;
        int end = 6;
        //  Starting    Continuing   Incrementing
        for (start = 1; start < end; start++){
            System.out.println(start);
        }
        // you can also use > greater than, >= greater or equal, <= less than or equal, or < less than

        // But lets say we didnt know how many times we wanted to run the loop, in this case you would use a while loop

        //While loops look like this --> while (condition){body}

        // Dividing line for your viewing pleasure
        System.out.println("--------------------");

        int number = (int) (Math.random() * 10); // Simply generates a random number 1-10
        System.out.println("first number: " + number);
        // if we wanted to roll this number until it was 5, we wouldnt know how many times that would loop
        // so instead we can say while the number isnt 5, reroll

        while (number != 5){
            number = (int) (Math.random() * 10);
            System.out.println("Your number: " + number);
        }
        // Stops when a 5 is randomly generated;
    }
}

package Lessons;

public class Lesson1 {
    public static void run()
    {
        // Every command line ends in a ; semicolon, this is what the computer recognizes as the stop of the line
        // The first command youll learn is called a print statement... They look like this
        System.out.println("This is a proper print statement"); // Notice the semi colon
        //when ran with the play button in the top right, it will print a line out to the console that says what ever is between the parenthesis.

        // we can also use + to add on to the print, For example:
        System.out.println("This is a statement " + "That continues on");

        //There is another print statement we can use for when we do not want a new line to end after the print statement
        System.out.print("This wont print a new line");
        System.out.print(" So if i use more statements it keeps going");
        System.out.println(" until a new line is made");

        //All programming languages use something known as data types to hold specific variables, for example one to hold a string of text and a different one to hold a number
        // These are the main java data types and proper instantion
        // Instantiation format is as follows: DataType name = Value;

        int Number = 17; // int holds an integer number, 1,2,3,4,5 but cannot hold decimal values
        double Percent = 177.098;// doubles hold a decimal value 1.001 ,1.231, 7.665
        char letter = 'H'; // Char variables hold a single character and the character has to be encased by single quotes ''
        String name = "Henrietta"; // String variables hold a string of characters as a line of text and have to be denoted by double quotes ""

        //Commands can now use these Data types by name to access what they store, for example:
        System.out.println(name);
        // will print out the value held in name

        System.out.println(Percent + Number);
        // Will print out a Double with the value of Percent + Number

        System.out.println(letter +", " + name);
        // Will print out the letter followed by a comma followed by the name

    }
}

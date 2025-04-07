package Lessons;

public class Lesson3 {
    public static void run() {
        //Sometimes we need to tell the computer to make a decision
        // In actuality we are making the decision and telling the computer what to do in certain cases

        // In java there are 2 ways of doing this each with their pros and cons

        // For this example lets say we want to generate a random number, if its higher than 5 do this otherwise do that
        //that would look like this

        int num = (int) (Math.random() * 10); // standard random number generator, dont worry about understanding it yet

        if (num > 5){
            System.out.print("Your number: " + num);
            System.out.println(" Your number is greater than 5");
        }
        else {
            System.out.print("Your number: " + num);
            System.out.println(" Your number is not greater than 5");
        }

        // this is called an if-else block, If (this){do this} else {do that},
        //we can also use an else if to say that if our first condition fails, give it another condition to try

        //For this example lets say we want to generate a random number and say if its higher than 5 print that its higher than 5,
        //but if its not higher than 5, but is between 3-5, well print its between 3-5, otherwise say its lower than 3
        // that would look like this

        int rngNum = (int)(Math.random() * 10); // once again, dont need to understand this yet
        //this time well print out the number first...
        System.out.print("Your number is: " + rngNum);

        if (rngNum > 5){
            System.out.println(" Your number is greater than 5");
        }
        //           this  && just means and, meaning both conditions have to be true
        else if (rngNum < 5 && rngNum >= 3){
            System.out.println(" Your number is between 3 and 5, Including 3 but not 5");
        }
        else {
            System.out.println(" Your number is lower than 3");
        }


        // if you notice, in the second block of else if, we use these signs && this just means and, meaning condition 1 && condtion 2 have to be true
        // we also use || for or meaning condition1 or condition2

        // the other way to say if something do this, is called a switch case block
        // they look like this
        int newNum = (int) (Math.random() * 10);
        System.out.print("Your number is : " + newNum);
        switch (newNum){
            case 1:
                System.out.println(" Computer says: Your number is 1");
                break;
            case 2:
                System.out.println(" Computer says: Your number is 2");
                break;
            case 3:
                System.out.println(" Computer says: Your number is 3");
                break;
            default:
                System.out.println(" Computer says: Your number is greater than 3");
        }
        // the break statement in each case simply means, if you go here do this and then stop looking.
        //Now this is not an example where you would want to use a switch case statement, however there are many applications where they are better than if else blocks

        // the setup for these statements look like this

        // switch (VARIABLE) {
        // case "possible outcome" : what you want to happen at that outcome; break;
        // case " different possible outcome" : what you want to happen at that outcome; break;
        // ...
        // default : What you want to happen if all cases fail
        // }
    }
}

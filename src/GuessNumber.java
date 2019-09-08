


/*
  @version date (in_ISO_8601 format: 2019-9-05) * @author rohit kathariya tharu
 */
// Number guessing program
// Import the util.scanner to read and save the user
import java.util.Scanner;

public class GuessNumber {


    public static void main(String[] args) {
        // creates the scanner with the line
        Scanner scanIn = new Scanner(System.in);
        //asks user input to enter the name
        System.out.println("What is your name?");
        //saves the user input name in variable name
        String name = scanIn.nextLine();
        //greets the user and asks to choose number between 1-10
        System.out.println("Hello, " + name + "! "+"Please pick a number between 1 to 10"+".");
        // method returns the random number between 1-10
        int aNumber = (int) (Math.random()*10)+1;
        // gets the user input and saves in variable num
        int num = scanIn.nextInt();
        //prints the user input number
        System.out.println("You guessed"+" "+ num);
        // checks the user input number and random number
        if (num == aNumber){
            System.out.println("Congratulation! you have guessed the right number that i was thinking.");
            // congrats the user if the number matches
        } else {
            System.out.println("I was thinking of the number "+ aNumber +".");
            // prints the condolence massage if the number is wrong.
            System.out.println("Sorry you guessed the wrong number.");

            System.out.println("Please try again.");
        }

        }

    }







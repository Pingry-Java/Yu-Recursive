

import java.util.Scanner; 


/**
 * This class represents a programs that asks for a number
 * and outputs the factorial of the number. 
 * @author Lindsey Yu
 * @author AP CompSci
 * @version 1
 */

public class Factorial  {

    /**
      * Main method calls the factorial method
      * @param args Standard array of commandline String arguments. Not used in this program.
      */  


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type an integer: ");

        double number =  keyboard.nextDouble(); //use double to store larger numbers

        keyboard.nextLine(); //new line 


        System.out.println(number + " factorial is: " + factorial(number));

    }



      /**
        * Recursive method for finding the factorial of the normal
        * @param number the number inputed by the user 
        * @return the factorial of the number
        */

        public static double factorial(double number) {



             if (number == 1) {
             return 1;
              }
            else {
                return (number * factorial(number-1)); } } //recursion! 
    }

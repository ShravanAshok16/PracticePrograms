//Java Program to Display Factors of a Number
package conditionalLoops;

import java.util.Scanner;

public class factorialOfANumber {
    public static void main(String[] args) {

        // positive number
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.print("Factors of " + number + " are: ");

        // loop runs from 1 to number
        for (int i = 1; i <= number; ++i) {

            // if number is divided by i
            // i is the factor
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

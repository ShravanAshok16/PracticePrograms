//Java Program to Calculate the Power of a Number
package conditionalLoops;

import java.util.Scanner;

public class powerOfANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int exponent = scan.nextInt();
        int result = 1;
        while(exponent != 0){
            result = result*base;
            --exponent;
        }
        System.out.println("The Power of a number with exponent "+exponent+" is "+result);
    }
}

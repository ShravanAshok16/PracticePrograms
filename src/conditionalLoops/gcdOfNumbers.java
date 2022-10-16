package conditionalLoops;

import java.util.Scanner;

public class gcdOfNumbers {
    public static void main(String[] args) {

        // find GCD between n1 and n2
        int n1 , n2 ;
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();
        n2 = scan.nextInt();

        // initially set to gcd
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {

            // check if i perfectly divides both n1 and n2
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);

        int lcm = (n1 * n2) / gcd;
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
         }
    }


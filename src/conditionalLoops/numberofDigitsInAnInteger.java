package conditionalLoops;

import java.util.Scanner;

public class numberofDigitsInAnInteger {
    public static void main(String[] args) {
        int count = 0;
        Scanner sca= new Scanner(System.in);
        int num = sca.nextInt();

        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}

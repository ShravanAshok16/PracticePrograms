package conditionalLoops;
import java.math.BigInteger;
import java.util.Scanner;

public class factorialOfNumber {
    public static void main(String[] args) {
        //using For Loop
        long fact = 1;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of Number "+num+" using For Loop is "+fact);
        //using While Loop
        long factorial = 1;
        int j = 1;
        while(j<=num){
            factorial=factorial*j;
            j++;
        }
        System.out.println("The factorial of Number "+num+" using While Loop is "+fact);
        int number = scan.nextInt();
        BigInteger factor = BigInteger.ONE;
        for(int i = 1; i <= number; ++i)
        {
            // factorial = factorial * i;
            factor = factor.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d = %d", num, factor);
    }
}

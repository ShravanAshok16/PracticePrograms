//Java Program to Check Whether a Number is Prime or Not
package conditionalLoops;

import java.util.Scanner;

public class checkPrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean flag = false;
        for(int i = 2;i<=num/2;++i){
            if(num%i==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("The Number "+num+" is a Prime Number");
        }else{
            System.out.println("The Number "+num+" is not a Prime Number");
        }

//Java Program to Display Prime Numbers Between Two Intervals
        int low = scan.nextInt();
        int high = scan.nextInt();
        while(low<high){
            boolean f = false;
            for(int i = 2;i<=low/2;++i){
                if(low%i==0){
                    f=true;
                    break;
                }
            }
            if (!f && low != 0 && low != 1)
                System.out.print(low + " ");
            ++low;
        }

    }
}

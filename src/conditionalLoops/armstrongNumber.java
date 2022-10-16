package conditionalLoops;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int originalNum = num;
        int number = num;
        int remainder;
        int result=0;
        int count = 0;

        //Count the number of digits in a Number
        while (number != 0) {
            number /= 10;
            ++count;
        }
        System.out.println("The number of digits in number is "+count);

        while(originalNum != 0){
            remainder = originalNum%10;
            result += Math.pow(remainder,count);
            originalNum/=10;
        }
        if (result==num){
            System.out.println("The number "+num+" is an Armstrong Number");
        }else {
            System.out.println("The number "+num+" is not an Armstrong Number");
        }

        //Armstrong Numbers between two intervals
        int low = scan.nextInt();
        int high = scan.nextInt();
        for (int i = low+1;i<=high;++i) {
            int digits = 0;
            int res = 0;
            int originalNumbers = i;

            // number of digits calculation
            while (originalNumbers != 0) {
                originalNumbers /= 10;
                ++digits;
            }
            originalNumbers = i;
            while(originalNumbers != 0){
                int remain = originalNumbers%10;
                res += Math.pow(remain,digits);
                originalNumbers/=10;
            }
            if(res == i ){
                System.out.print(i+" ");
            }
        }
    }
}

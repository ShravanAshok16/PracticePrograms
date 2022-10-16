package conditionalLoops;

import java.util.Scanner;

public class positiveOrNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number>0){
            System.out.println("The number "+number+" is positive");
        } else if (number<0) {
            System.out.println("The number "+number+" is negative");
        }else{
            System.out.println("The number "+number+" is zero");
        }
    }
}

package conditionalLoops;

import java.util.Scanner;

public class checkLeap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        boolean leapYear;
        // if the year is divided by 4
        if (year % 4 == 0) {
            //If the year is a century i.e. year ends with 00
            if(year%100==0){
                //If year is divisible by 400
                if(year%400==0){
                    leapYear=true;
                }else{
                    leapYear=false;
                }
            }else {
                // if the year is not century
                leapYear = true;
            }
        }else{
            leapYear=false;
        }
        if(leapYear==true) {
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }
    }
}

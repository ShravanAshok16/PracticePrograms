package functions;

import java.util.Scanner;

public class primeNumbersBetweenIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int low = scan.nextInt();
        int high = scan.nextInt();
        checkPrimeNumbers(low,high);
    }
    public static void checkPrimeNumbers(int l, int h){
        while(l<h){
            boolean f = false;
            for(int i = 2;i<=l/2;++i){
                if(l%i==0){
                    f=true;
                    break;
                }
            }
            if (!f && l != 0 && l != 1)
                System.out.print(l + " ");
            ++l;
        }
    }
}

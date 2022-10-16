package examples;

import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c;
        System.out.println("Values of before swap are a:"+a+" and b:"+b);
        //Swapping Numbers using a third Variable
        c=a;
        a=b;
        b=c;
        System.out.println("Values of Swapped Numbers are a:"+a+" and b:"+b);

        //Swapping Numbers without a third Variable
        int d = scan.nextInt();
        int e = scan.nextInt();
        System.out.println("Values of before swap are d:"+d+" and e:"+e);
        d=d-e;
        e=d+e;
        d=e-d;
        System.out.println("Values of Swapped Numbers are d:"+d+" and e:"+e);
    }
}

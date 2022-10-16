package conditionalLoops;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        StringBuilder reverseStr = new StringBuilder();

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr.append(str.charAt(i));
        }

        if (str.equalsIgnoreCase(reverseStr.toString())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}

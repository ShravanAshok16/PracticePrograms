import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;  
import java.io.InputStreamReader;
 
 public class playground{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        partitionNegativeAndPositive(n, arr);
    }
    static  boolean oppositeSign(int x,int y) {
        return ((x^y)<0);
    }
    // Method to partition negative and positive numbers without comparing with 0
    static void partitionNegativeAndPositive(int n, int arr[]) {
    /* 
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        
        a.add(arr[0]);
        // Now put all elements of same sign
        // in a[] and opposite sign in b[]
        for(int i=1;i<n;i++) {
            if(oppositeSign( a.get(0), arr[i])) {
                b.add(arr[i]);
            }else {
                a.add(arr[i]);
            }
        }
        
        if(a.size()==n && a.get(0)>=0) {
            System.out.println(a.toString().replace("[","").replace("]","".replace(",", "")));
            System.out.println("Array doesn't have negative numbers");
        }
        else if(a.size()==n && a.get(0)<0) {
            System.out.println(a.toString().replace("[","").replace("]","").replace(",", ""));
            System.out.println("Array doesn't have positive numbers");
        }
        else {
            System.out.println(a.toString().replace("[","").replace("]","").replace(",", ""));
            System.out.println(b.toString().replace("[","").replace("]","").replace(",", ""));
        }
        */
        ArrayList<Integer> positive = new ArrayList<>(), negative = new ArrayList<>();

        List<List<Integer>> posNeg = Arrays.asList(positive, negative);
    
        for(int i: arr) posNeg.get(i >>> 31).add(i);
    
        if(positive.isEmpty()) {
            System.out.println("Array doesn't have positive numbers");
        }
        else {
            System.out.println(Arrays.toString(positive.toArray()).replace("[", "").replace("]", " ").replace(",", ""));
        }
        if(negative.isEmpty()) {
            System.out.println("Array doesn't have negative numbers");
        }
        else {
            System.out.println(Arrays.toString(negative.toArray()).replace("[", "").replace("]", " ").replace(",", ""));
        }
    }
 }
package examples;
import java.util.*;
public class findElementInArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        search(arr, k);
    }

    // Method to search for k in an unsorted array
    static void search(int[] arr, int k) {
		String res="false";
		for(int s:arr){
			if(s==k){
				res="true";
				break;
			}
		}
		System.out.println(res);
    }
}

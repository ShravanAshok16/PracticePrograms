package conditionalLoops;

public class sumOfNaturalNumbers {
    public static void main(String[] args) {
        //using For Loop
        int sum=0,i,num=100;
        for (i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("The sum of Natural numbers using For Loop is "+sum);
        //using While Loop
        int add=0,j=1,number=100;
        while(j<=number){
            add=add+j;
            j++;
        }
        System.out.println("The sum of Natural numbers using While Loop is "+add);
        //using do while
        int s=0,k=1,n=100;
        do {
            s=s+k;
            k++;
        }while(k<=n);
        System.out.println("The sum of Natural numbers using Do While Loop is "+s);
    }
}

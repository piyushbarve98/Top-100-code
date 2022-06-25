import java.util.Scanner;

public class SumOfNNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n to get sum of n natural numbers");
        int n = sc.nextInt();

        int sum =0;

        /* Normal loop method */

        // while(n!=0){
        //     sum += n;
        //     n--;
        // }
        // System.out.println(sum);

        /* formula of sum method */
        // sum = n*(n+1)/2;
        // System.out.println(sum);

        /* Recursion Method */

        System.out.println(sumOfN(n));
    }

    public static int sumOfN(int n){
        if(n==1) return 1;
        return n + sumOfN(n-1);
    }
}

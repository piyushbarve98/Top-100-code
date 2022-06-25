import java.util.Scanner;

/**
 * SumOfNumInRange
 */
public class SumOfNumInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum = y*(y+1)/2 - x*(x+1)/2;

        System.out.println(sum);
    }
    
    
}
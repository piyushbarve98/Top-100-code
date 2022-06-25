import java.util.Scanner;

public class greatestOfTwo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b to check which is greater: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a>b?a:b);
    }
    
}

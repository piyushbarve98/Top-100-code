import java.util.Scanner;

public class greatestOfThreeNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c to check which is greatest: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int temp = a>b?a:b;
        int greatest = c>temp?c:temp;
        System.out.println(greatest);

    }
}

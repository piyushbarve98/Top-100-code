import java.util.Scanner;

public class OddOrEven {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n to check whether odd or even");
        int n = sc.nextInt();

        // String s = (n%2==0)?"Even" : "Odd";
        
        // System.out.println(s);

        String s = (n & 1) !=1 ? "Even" : "Odd"; 
        System.out.println(s);

        
    }
}

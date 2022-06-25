import java.util.Scanner;

public class primeOrNot {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check if it is prime: ");
        int num = sc.nextInt();
        boolean flag = true;
        for(int i=2; i*i<=num; i++){
            if(num%2==0){
                flag = false;
                break;
            }
        }
        System.out.println(flag?"Prime":"Not Prime");
    }
}

import java.util.Scanner;

class PositiveOrNegative{

    // public static void main(String[] args){

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter n to check if positive or negative");
    //     int n = sc.nextInt();

    //     if(n>0){
    //         System.out.println("Positive");
    //     }
    //     else if(n<0){
    //         System.out.println("Negative");
    //     }

    //     else{
    //         System.out.println("Zero");
    //     }

    // }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n to check if positive or negative");
        int n = sc.nextInt();

        String temp = n>0 ? "Positive" : "Negative";

        System.out.println(temp);

        

    }

}
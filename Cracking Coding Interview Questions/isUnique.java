
import java.util.*;

class isUnique{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] tempArr = new int[128];
        boolean flag = true;
        for(int i=0; i<s.length(); i++){
            int val = s.charAt(i);
            if(tempArr[val] == 1){
                System.out.println("False");
                flag = false;
                break;
            }
            tempArr[val] = 1;
        }
        if(flag) System.out.println("True");
    }
}
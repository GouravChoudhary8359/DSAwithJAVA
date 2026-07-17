package Loop;

import java.util.Scanner;

public class ToCheckForCompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Check for composite number : ");
        int n = sc.nextInt();
        int ct = 0;
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i == 0)
                ct++;


        }
        if(n==1){
            System.out.println(" neither prime not composite");
        }else if(ct > 0){
            System.out.println(" Composite Number and their are "+(ct+2)+" Factors of "+n);
        }else {
            System.out.println(" prime Number");
        }
    }
}

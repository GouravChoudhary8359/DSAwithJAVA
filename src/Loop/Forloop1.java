package Loop;

import java.util.Scanner;

public class Forloop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter times of repeatation : ");
        int r = sc.nextInt();
        sc.nextLine();
        System.out.println(" Enter what you want to repeat : ");
        String sr = sc.nextLine();
        for(int i=1;i<=r;i++){
            System.out.print(sr+" ");
        }
    }
}

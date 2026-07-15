package Java_Basics;

import java.util.Scanner;

public class Even_odd {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number to check even ot odd :");
        int a = sc.nextInt();
        String rs = (a%2 == 0) ? "even" : "odd";
        System.out.println(" The number "+a+" is"+rs);

    }
}

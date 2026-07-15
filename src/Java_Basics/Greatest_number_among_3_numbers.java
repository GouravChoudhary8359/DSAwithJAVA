package Java_Basics;

import java.util.Scanner;

public class Greatest_number_among_3_numbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println(" Enter third number: ");
        int c = sc.nextInt();
        if(a>b && a>c)
            System.out.println(" Greatest no is : "+a);
        else if (b>c && b>a)
            System.out.println(" Greatest no is :"+b);
        else
            System.out.println("Greatest no is : "+c);


    }
}

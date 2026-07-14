package Java_Basics;

import java.util.Scanner;

public class Side_of_triangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1:");
        int a = sc.nextInt();
        System.out.println("Enter side 2:");
        int b = sc.nextInt();
        System.out.println("Enter side 3:");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("valid Triangle !!");
        }else {
            System.out.println(" Invalid Triangle !!");
        }

    }


}

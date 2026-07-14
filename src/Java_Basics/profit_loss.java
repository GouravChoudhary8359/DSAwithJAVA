package Java_Basics;

import java.util.Scanner;

public class profit_loss {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price:");
        double cp = sc.nextDouble();
        System.out.println("Enter the selling price:");
        double sp = sc.nextDouble();
        double result = sp-cp;
        if(result > 0){
            System.out.println("profit of "+result);
        } else if (result ==0) {
            System.out.println(" neutral no profit and loss");
        }else{
            System.out.println("loss of "+(-result));
        }
    }
}

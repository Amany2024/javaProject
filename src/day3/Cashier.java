package day3;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter number of items");
        int numberOfItems=Scanner.nextInt();
        double total=0;
        for(int i=1;i<=numberOfItems;i++){
            System.out.println("Enter Price of item number "+i);
            double price=Scanner.nextDouble();
            total=total+price;
        }
        System.out.println("Total price is :"+total);
        Scanner.close();
    }
}

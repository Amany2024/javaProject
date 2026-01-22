package day4;

import java.util.Scanner;

public class GreetUser
{
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String name=getUserName();
        greetUser(name);
        scanner.close();
    }
    public static String getUserName(){
        System.out.println("Enter your name");
        String name=scanner.nextLine();
        return name;
    }
    static void greetUser(String name){
        System.out.println("Hello "+name);
    }

}

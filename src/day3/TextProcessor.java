package day3;

import java.util.Scanner;

public class TextProcessor {
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter some text");
        String text = Scanner.nextLine();
        boolean flag=false;
        int position=0;
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a')
            {
                position=i;
                flag=true;
                break;
            }
        }
        if(flag=true)
        {
            System.out.println("Letter A found at position "+position);
            System.out.println();
        }
        else{
            System.out.println("letter A is not found");
        }
        Scanner.close();
    }
}
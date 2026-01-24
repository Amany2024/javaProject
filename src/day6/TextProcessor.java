package day6;

public class TextProcessor {
    public static void main(String[] args) {
        counhtWords("i love amany and java");
        reverseText("Ahmed");
        addSpace("ILoveJavaAndAmany");

        String s1="Ahmed";
        String s2="Ahmed";
        String s3=new String("Ahmed");
        String s4=new String("Ahmed");

        System.out.println(s1.equals(s2));  //True
        System.out.println(s1==s2);         //true
        System.out.println(s1.equals(s3));  //True
        System.out.println(s3.equals(s4));  //True
        System.out.println(s3==s4);         //False


    }
    public static void counhtWords(String text){
       String []words= text.split(" ");
       String message=String.format("Your text contains %d words!",words.length);
       for(String word:words)
       {
           System.out.println(word);
       }

    }

    public static void reverseText(String text)
    {
        for (int i=text.length();i>0;i--){
            System.out.print(text.charAt(i-1));
        }
        System.out.println(" ");
    }

    /**
     *
     * @param text
     */


    public static void addSpace(String text)
    {
        StringBuffer modifiedText=new StringBuffer(text);
        for(int i=0;i<modifiedText.length();i++)
        {
            if(Character.isUpperCase(modifiedText.charAt(i)))
            {
                modifiedText.insert(i," ");       // ? {} [] * + ^ $ | () ف حاله لو هستخدمهه كفواصل لازم حط قبلها (//)
                i++;
            }
        }
        System.out.println(modifiedText);

    }
}

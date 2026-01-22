package day3;

public class BreakvsContinue {
    public static void main(String[] args) {

        //continue
        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }



        //break
        for(int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }

    }
}

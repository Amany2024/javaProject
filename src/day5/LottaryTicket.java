package day5;
//Arrays
import java.util.Random;
public class LottaryTicket {
    private static final int length=6;
    private static final int maxTicketNumber=69;
    static int randomNumber;
    public static void main(String[] args)
    {
        int[] ticket = generateTicketNumbers();
        printTicket(ticket);
    }

    /**
     *
     * @return
     */

    public static int[] generateTicketNumbers()
    {
        int[] ticket = new int[length];
        Random random = new Random();

        for (int i = 0; i < ticket.length; i++)
        {
            do{
                randomNumber = random.nextInt(maxTicketNumber)+1;
                                                                  //maxTicketNumber is exclusive so we add 1
            } while (search(ticket,randomNumber ));
            ticket[i]=randomNumber;

        }
        return ticket;
    }

    /**
     * Sequential search to check if all numbers in array are unique
     *
     * @param ticket
     * @param number
     * @return
     */
    public static boolean search(int[] ticket,int number){


        for(int value:ticket)      //Enchanced for loop      (value from array:arrayName)
        {
         if(value==number)
         {
             return true;
         }
        }
        return false;
//        for(int i=0;i<length;i++)
//        {
//            if(number==ticket[i])
//            {
//                return true;
//            }
//        }
//        return false;
    }

    /**
     *
     * @param ticket
     */

    public static void printTicket(int [] ticket)
    {
        for(int number:ticket)            //Enhanced for loop
        {
            System.out.print(number+" | ");
        }
//        for(int i=0;i<ticket.length;i++){
//            System.out.println(ticket[i]);
//        }
    }

}

package day6;
//Array implementation
import java.util.Scanner;
public class Grades {
    private static Scanner scanner=new Scanner(System.in);
    public static int [] grades;
    public static void main(String[] args)
    {
        int [] grades= getGrades();
        printGrades(grades);
        int sum=calculateSum(grades);
        System.out.println("Sum of grades is :"+sum);
        double avg=calculateAvg(sum);
        System.out.println("Average of grades is :"+avg);
        int largestGrade=gethighestValue(grades);
        System.out.println("largest grade is :"+largestGrade);
        int lowestGrade=getlowestValue(grades);
        System.out.println("Lowest grade is :"+lowestGrade);
        scanner.close();
    }

    public static int[] getGrades()
    {
        //int [] grades;
//        Scanner scanner=new Scanner(System.in);
        System.out.println("How many grades you want to enter?");
        //int length=scanner.nextInt();
        grades=new int[scanner.nextInt()];
        for(int i=0;i<grades.length;i++){
            System.out.println("Enter grade "+(i+1));
            grades[i]=scanner.nextInt();
        }
        return grades;
    }

    public static void printGrades(int [] grades){
        for(int i=0;i<grades.length;i++){
            System.out.print(grades[i]+" | ");
        }
        System.out.println();

    }

    public static int calculateSum(int []grades)
    {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        return sum;
    }
    public static double calculateAvg(int sum){
        double avg=sum/grades.length;
        return avg;
    }

    public static int gethighestValue(int [] grades)
    {
        int highest=grades[0];
        for(int i=0;i<grades.length;i++){
            if(highest<grades[i]){
                highest=grades[i];
            }
        }
        return highest;
    }
    public static int getlowestValue(int [] grades){
        int lowest=grades[0];
        for(int i=0;i<grades.length;i++){
            if(lowest>grades[i]){
                lowest=grades[i];
            }
        }
        return lowest;
    }
}

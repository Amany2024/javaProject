package day3;

import java.util.Scanner;

public class StudentAverageScore {
    public static void main(String[] args) {

        //what we have
        int numberOfStudents=3;
        int numberOfCourses=4;
        //what we need
        //loop for students
        //nested loop for courses for each student
        Scanner Scanner=new Scanner(System.in);


        for(int i=1;i<=numberOfStudents;i++){
            double total=0;
            for(int j=1;j<=numberOfCourses;j++) {
                System.out.println("Enetr Score for course " + j +" for student " + i);
                double score=Scanner.nextDouble();
                total = total+score;
            }
            double avg=total/numberOfCourses;
            System.out.println("Avg for student "+i+ "is "+avg);
        }
    }
}

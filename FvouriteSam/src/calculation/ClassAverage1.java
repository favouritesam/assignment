package calculation;

import java.util.Scanner;

public class ClassAverage1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int student = 10;
        double sum = 0;


        System.out.println("Enter Student grade range 0-100 or -1 to quit");
        double scores = input.nextDouble();


        while (scores != -1) {
            sum += scores;


            System.out.println("Enter Student grade range 0-100 or -1 to quit");
            scores = input.nextDouble();
        }
            double average = sum / student;

            System.out.printf("The class average is %f", average);

    }
}
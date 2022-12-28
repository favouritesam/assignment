package calculatorTwo;

import java.util.Scanner;

public class CalculateClassAverage2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int result = 0;
        int student = 1;

        while (student <= 10) {
            System.out.print("Enter result(1 = pass, 2 = fail):");
            student = input.nextInt();


            if (result == 1) {
                passes = passes + 1;

            } else if (failures == failures + 1) {
                student = student + 1;
            }
            System.out.println("passes:");
            System.out.println("failures:");
            if (passes > 8) {
                System.out.println("Raise tuition");
            }
        }
    }
}
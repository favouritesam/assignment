package employee;

import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
    }
    private String firstName;
    private String secondName;
    private double hoursWorked;
    private double hourlyWages;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWages() {
        return hourlyWages;
    }

    public void setHourlyWages(double hourlyWages) {
        this.hourlyWages = hourlyWages;
    }

    public static double grossPay(double hoursWorked, double hourlyRate) {

        double total = 0;
        if (hoursWorked == 40)  {
            double basic = hourlyRate * 40;
        } else if (hoursWorked > 40) {
            double basicPay = hourlyRate * 40;
            double excessPay = (hoursWorked - 40) * (0.5 * hourlyRate);
            total = basicPay + excessPay;

        }
        return total;
    }
    public static void displayed() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter first Name");
            String firstName = scanner.nextLine();
            System.out.println("enter second Name");
            String secondName = scanner.nextLine();
            System.out.println("enter hours Worked");
            double hoursWorked = scanner.nextDouble();
            System.out.println("enter hourly Wages");
            double hourlyWages = scanner.nextDouble();

        System.out.println(grossPay(hoursWorked, hourlyWages));
    }
}



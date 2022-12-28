package justlearn1;

import java.util.Scanner;

public class ClassWorkOne {
    public static void main(String[] args) {
        display();
    }
    private String firstName;
    private String secondName;
    private double hourlyWork;
    private double hourlyPay;

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

    public double getHourlyWork() {
        return hourlyWork;
    }

    public void setHourlyWork(double hourlyWork) {
        this.hourlyWork = hourlyWork;
    }
    public double getHourlyPay(){
      return hourlyPay;
    }
    public void setHourlyPay(double hourlyPay){
        this.hourlyPay = hourlyPay;
    }
    public static double grossPay(double hourlyWork, double hourlyPay) {
        double totalPay = 0;
        if (hourlyWork == 40) {
            double basicSalary = hourlyPay * 40;
        } else if (hourlyWork > 40) {
            double basicSalary = hourlyWork * 40;
            double excessHour = - 40;
            double excessPay = (excessHour - 40) * (hourlyPay / 2);
        }
        return totalPay;

    }

    public static void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first name");
        String firstName = scanner.nextLine();
        System.out.println("enter second name");
        String secondName = scanner.nextLine();
        System.out.println("enter hourly worked");
        double hourlyWork = scanner.nextDouble();
        System.out.println("enter hourly pay");
        double hourlyPay = scanner.nextDouble();

        System.out.println(grossPay(hourlyWork,hourlyPay));
    }
}





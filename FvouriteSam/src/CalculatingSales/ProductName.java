package CalculatingSales;

import java.util.Scanner;
public class ProductName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalRetail = 0;

        int productNumber;
        while (true) {
            System.out.println("1 - product 1,$2.98");
            System.out.println("2 - product 2,$4.50");
            System.out.println("3 - product, $9.98");
            System.out.println("4 - product,$4.49");
            System.out.println("5 - product,$6.87");
            System.out.println("6 - Exist program");
            System.out.println("Enter product number:");
            productNumber = scanner.nextInt();
            if (productNumber == 6) {
                break;
            }
                System.out.print("Enter quantity sold:");
                int quantitySold = scanner.nextInt();

                switch (productNumber) {
                    case 1:
                        totalRetail = 2.98 * quantitySold;
                        break;
                    case 2:
                        totalRetail += 4.50 * quantitySold;
                        break;
                    case 3:
                        totalRetail += 9.98 * quantitySold;
                        break;
                    case 4:
                        totalRetail += 4.49 * quantitySold;
                        break;
                    case 5:
                        totalRetail += 6.87 * quantitySold;
                        break;

                    default:
                        break;
                }

            }

        }
    }




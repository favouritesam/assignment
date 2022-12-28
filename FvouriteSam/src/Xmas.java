import java.util.Scanner;

public class Xmas {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first day of choice 1 to 12");
        for (int i = 0; i < 12; i++) {

            i = input.nextInt();
            switch (i) {
                case 1:
                    System.out.println("A partridge in a pear tree");
                    System.out.println("**********************************************");
                    break;
                case 2:
                    System.out.println("Two Turtle doves");
                    System.out.println("**********************************************");
                    break;
                case 3:
                    System.out.println("Three French hens");
                    System.out.println("*********************************************");
                    break;
                case 4:
                    System.out.println("Four Calling birds");
                    System.out.println("*********************************************");
                    break;
                case 5:
                    System.out.println("Five Golden rings");
                    System.out.println("*********************************************");
                    break;
                case 6:
                    System.out.println("Six Geese A-laying");
                    System.out.println("*********************************************");
                    break;
                case 7:
                    System.out.println("Seven Swans A-swimming");
                    System.out.println("***********************************************");
                    break;
                case 8:
                    System.out.println("Eight Maids A-milking");
                    System.out.println("************************************************");
                    break;
                case 9:
                    System.out.println("Nine Ladies Dancing");
                    System.out.println("************************************************");
                    break;
                case 10:
                    System.out.println("Ten Lords A-leaping");
                    System.out.println("*************************************************");
                    break;
                case 11:
                    System.out.println("Eleven Pipers piping");
                    System.out.println("***************************************************");
                    break;
                case 12:
                    System.out.println("Twelve Drummer Drumming");
                    System.out.println("*************************************************");
                    break;
            }
        }
    }
}


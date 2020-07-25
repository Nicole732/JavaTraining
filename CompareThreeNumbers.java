
// This program takes in three numbers and prints the greatest.
// It also showcases the use of different operators
import java.util.Scanner;

class CompareThreeNumbers {
    public static void main(String[] Args) {

        System.out.println("Let us compare three numbers of your choice to find the biggest.");
        int num1, num2, num3, biggestNumber;

        Scanner nb = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = nb.nextInt();
        System.out.println("Enter the second number: ");
        num2 = nb.nextInt();
        System.out.println("Enter the third number: ");
        num3 = nb.nextInt();
        nb.close();

        // comparing the frist two numbers
        // (num1 >= num2)? biggestNumber = num1 : biggestNumber = num2;

    }

}
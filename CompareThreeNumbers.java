
// This program takes in three numbers and prints the greatest.
// It also showcases the use of different operators
import java.util.Scanner;

class CompareThreeNumbers {
    public static void main(String[] Args) {

        System.out.println("Let us compare three numbers of your choice to find the biggest.");
        int num1, num2, num3;
		int biggestNumber;

        Scanner nb = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = nb.nextInt();
        System.out.println("Enter the second number: ");
        num2 = nb.nextInt();
        System.out.println("Enter the third number: ");
        num3 = nb.nextInt();
        nb.close();

        // comparing the frist two numbers with ternary operator in lieu of if else statements
        biggestNumber = (num1 >= num2)? num1 : num2;
        System.out.println( "The biggest of the first two numbers is: " + biggestNumber );
        biggestNumber = (biggestNumber >= num3)? biggestNumber : num3;
        System.out.println("#################");
        System.out.println("The biggest number is: " + biggestNumber);

        System.out.println("#################");
        if (biggestNumber % 2 == 0){
            System.out.println("Our biggest number is even.");

        } else {
            System.out.print("Our biggest number is odd.");
        }
    }

}
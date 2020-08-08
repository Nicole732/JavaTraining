import java.util.Scanner;

class AverageThree {
    // to compute the average of three numbers with user's input
    public int ComputeAverageofThree(int num1, int num2, int num3) {
        int av = (num1 + num2 + num3) / 3;
        return av;
    }

    public static void main(String[] agrs) {
        // get input from user
        int num1, num2, num3, result;
        Scanner num = new Scanner(System.in);
        System.out.println("Let us find the average! What is the first number?: ");
        num1 = num.nextInt();
        System.out.println("What is the second number?: ");
        num2 = num.nextInt();
        System.out.println("What is the third number?: ");
        num3 = num.nextInt();
        num.close();
        // compute the average with the method

        AverageThree average = new AverageThree();
        result = average.ComputeAverageofThree(num1, num2, num3);

        System.out.println("The average of these three numbers is: " + result);
        System.out.println("********************************");
    }

}
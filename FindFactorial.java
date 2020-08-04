import java.util.Scanner;

class FindFactorial {

    public static void main(String[] args) {
        // this codes finds the factorial of a given number
        int numFactorial, num;
        System.out.println("Enter a number of your choice to find its factorial : ");
        Scanner nb = new Scanner(System.in);
        num = nb.nextInt();
        nb.close();
        System.out.println(num);
        numFactorial = num;
        for (int i = num-1; i > 0; i--) {
            numFactorial *= i;

        }
        System.out.println("The factorial of  " + num + " is " + numFactorial);

    }

}
import java.util.Scanner;

public class VariablesIntro {

    static String name = "Beatrice";

    /*
     * public void totalIncome(int[] args) {
     * 
     * 
     * }
     */

    public static void main(String[] args) {
        // use of different variable types
        int age = 42;
        char nameFirstLetter = 'B';
        System.out.println("###############");
        System.out.println(name + " starts with " + nameFirstLetter + ", and she is " + age + " years old.");
        System.out.println("###############");

        // addition of two numbers using the Scanner utility
        int salary1, salary2, totalSalary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first salary: ");
        salary1 = sc.nextInt();
        System.out.println("Enter the second salary: ");
        salary2 = sc.nextInt();
        sc.close();
        totalSalary = salary1 + salary2;
        System.out.print(name + "'s annual income is: ");
        System.out.print("$" + totalSalary + "\n");
        System.out.println("###############");

        // addition using a method totalIncome with int arguments input??

    }

}

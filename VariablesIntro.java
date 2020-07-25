import java.util.Scanner;

public class VariablesIntro {

    static String name = "Beatrice";

    public static void totalIncome(String[] args) {
        int salary1Arg = Integer.parseInt(args[0]);
        int salary2Arg = Integer.parseInt(args[1]);
        int totalSalaryArg = salary1Arg + salary2Arg;
        System.out.println(name + " annual salary with the provided arguments is " + totalSalaryArg);

    }

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

        // addition using a method totalIncome with int arguments input
        //VariablesIntro.totalIncome();

        //addition using input arguments while calling the class
        int salary1Arg = Integer.parseInt(args[0]);
        int salary2Arg = Integer.parseInt(args[1]);
        int totalSalaryArg = salary1Arg + salary2Arg;
        System.out.println(name + " annual salary with the provided arguments is $" + totalSalaryArg);
    }

}

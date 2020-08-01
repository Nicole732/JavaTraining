public class CalculatorWithSwitch {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String operator = args[2];
        switch (operator) {
            case "+":
                System.out.println("The sum of the two numbers is: " + (num1 + num2));
                break;
            case "-":
                System.out.println("The substraction of the two numbers gives: " + (num1 - num2));
                break;
            case "/":
                System.out.println("The division of the two numbers gives: " + (num1 / num2));
                break;
            case "*":
                System.out.println("The product of the two numbers gives: " + (num1 * num2));
                break;
            default:
                System.out.println("Please provide valid input. The operation could not be performed.");
        }
    }

}
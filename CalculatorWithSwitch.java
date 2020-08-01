public class CalculatorWithSwitch {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        char operator = args[2].charAt(0);
        //need to provide the * operator as '*' when giving the argument. * is reserved in Java
        //could also use String operator = args[2], and change cases to "+"... not best practice
        switch (operator) {
            case '+':
                System.out.println("The sum of the two numbers is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("The substraction of the two numbers gives: " + (num1 - num2));
                break;
            case '/':
                System.out.println("The division of the two numbers gives: " + (num1 / num2));
                break;
            case '*':
                System.out.println("The product of the two numbers gives: " + (num1 * num2));
                break;
            default:
                System.out.println("Please provide valid input. The operation could not be performed.");
        }
    }

}
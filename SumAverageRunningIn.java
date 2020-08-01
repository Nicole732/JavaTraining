public class SumAverageRunningIn {
    // this code produces the sum of integer from 1 to 100
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 100; i++) {
            total += i;
        }
        System.out.println("The total of the first 100 integers is " + total);
    }
}
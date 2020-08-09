import java.util.Scanner;

public class IsPrime {
    // Write a Java method that takes an integer and returns true if it is a prime
    // number.
    public boolean CheckIfPrime(int num){
        if(num % num == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number, and let us see if it is prime! ");
        Scanner prscan = new Scanner(System.in);
        num = prscan.nextInt();
        prscan.close();
        IsPrime pr = new IsPrime();
        if (pr.CheckIfPrime(num)){
            System.out.println("This number is prime");
        } else {
            System.out.println("This number is not prime");
        }
        
    }
}
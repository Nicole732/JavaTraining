/*
*Lab*
Create an Interface BankInterface with methods void credit(Long accountNumber, double amount) 
and boolean debit(Long accountNumber, double amount).
Create an abstract class 'Bank' with an abstract method 'getBalance'. 
$100, $150 and $200 are deposited in banks A, B and C respectively.
 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a 
 method named 'getBalance'. Call this method by creating an
  object of each of the three classes.
*/
interface BankInterface {
    void credit(Long accountNumber, double amount);

    boolean debit(Long accountNumber, double amount);
}
abstract class Bank {
    public abstract void getBalance();
}
class BankA extends Bank {

    public void getBalance(){
        System.out.println("The Balance in BankA is $100.");
    }
}
class BankB extends Bank {
    public void getBalance(){
        System.out.println("The Balance in BankB is $150.");
    }
        
}
class BankC extends Bank {
    public void getBalance(){
        System.out.println("The Balance in BanKC is $200.");
    }
   
}
public class week9 {
    public static void main(String[] args) {
        System.out.println("*** Test Method ***");

    }
}

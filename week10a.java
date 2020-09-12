/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
	Given a string , print Yes if it is a palindrome, print No otherwise.
*/
import java.util.Scanner;

public class week10a {

    public static void main(String[] args) {
        //receive input from user
        String testWord;
        System.out.println("Enter a word and let us see if it is a palindrome! ");
        Scanner tw = new Scanner(System.in);
        testWord = tw.nextLine();
        tw.close();
        System.out.println(testWord);
    }
   



    
}

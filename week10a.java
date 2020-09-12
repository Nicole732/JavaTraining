/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
    Given a string , print Yes if it is a palindrome, print No otherwise.
    examples: Anna, noon, pap, refer, radar, madam, teet...
*/
import java.util.Scanner;


public class week10a {

    public static void main(String[] args) {
        //receive input from user, trims and convert it to lower case
        System.out.println("Enter a word and let us see if it is a palindrome! ");
        Scanner tw = new Scanner(System.in);
        String testWord = new String(tw.nextLine());
        tw.close();
        testWord = testWord.toLowerCase().trim();
        System.out.println(testWord);
        
        //reverse the word
        String reversedWord = "";
        char[] ch = testWord.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            reversedWord += ch[i];
        }
        System.out.println("Reverse of provided word is: " + reversedWord.toLowerCase().trim());
        
        //Compare the two word to see if they are equal 
        //then conclude that it is a palindrome
        if (testWord.equalsIgnoreCase(reversedWord)) {
            System.out.println("The Word " + testWord + " is a palindrome!");
            System.out.println("******************");
        } else {
            System.out.println("The Word " + testWord + " is a not palindrome!");
            System.out.println("******************");
        }

    }
}

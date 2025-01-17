import java.util.Scanner;
//to lowercase
public class AlizaPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Enter a word and I will check if it's a palindrome.");
        String word = scan.next;*/

        //TEST CODE
        String word1 = "a";
        String word2 = "at";
        String word3 = "dad";
        String word4 = "cat";
        String word5 = "foot";
        String word6 = "toot";

        isPalindrome(word1);
        isPalindrome(word2);


    }//end main
    public static void isPalindrome(String word) {
        //add case for no word entered
        if (word.length() == 1 || word.length() == 2) {
            System.out.println(word + " is not a palindrome.");
        }
    }//end isPalindrome
}
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
        String word3 = "madam";
        String word4 = "crane";
        String word5 = "foot";
        String word6 = "toot";

       /*isPalindrome(word1);//works
        isPalindrome(word2);//works

        //odd palindrome
        isPalindrome(word3);
        //odd not palindrome
        isPalindrome(word4);

        //even not palindrome
        isPalindrome(word5);
        //even is palindrome
        isPalindrome(word6);*/


    }//end main

    //RECURSIVE METHOD
    public static void isPalindrome(String word) {
        word.toLowerCase();
        //case for one letter word
        if(word.length() == 1) {
            System.out.println(word + " is not a palindrome.");
            return;
        }//end if statement

    }//end isPalindrome

    //ITERATIVE METHOD
    public static void isPalindromeIteration(String word) {
        word.toLowerCase();
        if(word.length() == 1) {
            System.out.println(word + " is not a palindrome.");
            return;
        }//end if statement
        //check if palindrome
        for (int i = 0; i < word.length()/2; i++) {
            //NOT PALINDROME if chars don't match at opposite ends of word
            if(word.charAt(i) != word.charAt(word.length()-(i+1))){
                System.out.println(word + " is not a palindrome.");
                return;
            }//end if statement
        }//end for loop
        //IS PALINDROME
        System.out.println(word + " is a palindrome.");
    }//end isPalindromeIteration
}
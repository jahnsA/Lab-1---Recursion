import java.util.Scanner;
public class AlizaPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInt;
        do { 
            System.out.println("Enter a word and I will check if it's a palindrome:");
            String word = scan.next();
            //word to lower case so ASCII values work
            word = word.toLowerCase();
            isPalindrome(word);
            System.out.println("Enter 1 to continue or 0 to quit.");
            userInt = scan.nextInt();
        } while(userInt != 0);
    }//end main
    
    //RECURSIVE METHOD: solved differently than iterative
    public static void isPalindrome(String word) {
        //case for one letter word or blank
        if(word.length() <= 1) {
            System.out.println(word + " is not a palindrome.");
            return;
        }//end if statement
        isPalindromeHelper(word, 0, word.length()-1);
    }//end isPalindrome
    //recursive helper method
    public static void isPalindromeHelper(String word, int left, int right) {
        if(left >= right){
            System.out.println(word + " is a palindrome.");
            return;
        }//end if statement
        if(word.charAt(left) != word.charAt(right)){
            System.out.println(word + " is not a palindrome.");
            return;
        }//end if statement
        isPalindromeHelper(word, left + 1, right - 1);
    }//end isPalindromeHelper

    //ITERATIVE METHOD
    /*public static void isPalindromeIteration(String word) {
        word.toLowerCase();
        if(word.length() <= 1) {
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
    }//end isPalindromeIteration*/
}//end class AlizaPalindrome
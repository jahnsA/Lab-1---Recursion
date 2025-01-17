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

        isPalindrome(word1);//works
        isPalindrome(word2);//works

        //odd palindrome
        isPalindrome(word3);
        //odd not palindrome
        isPalindrome(word4);

        //even not palindrome
        isPalindrome(word5);
        //even is palindrome
        isPalindrome(word6);


    }//end main
    public static void isPalindrome(String word) {
        //add case for no word entered
        word.toLowerCase();
        if(word.length() == 1) {
            System.out.println(word + " is not a palindrome.");
            return;
        }
        //should work for even and odd
        for (int i = 0; i < word.length()/2; i++) {
            //if chars don't match at opposite ends of word
            if(word.charAt(i) != word.charAt(word.length()-(i+1))){
                System.out.println(word + " is not a palindrome.");
                return;
            } 
        }//end for loop
        System.out.println(word + " is a palindrome.");
    }//end isPalindrome
}
import java.util.Scanner;

public class SarahPalindrome {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //create new scanner

        System.out.println("Enter a string for me to check if palindrome. No spaces.");

        String userString = input.next();
        userString = userString.toLowerCase(); //to keep code from breaking because it won't work with upper case and lower case letters.

        isPalindrome(userString, 0, userString.length()-1);
        
        input.close();
        }
        
        public static void isPalindrome (String userString, int startIndex, int lastIndex) {

            String firstLetter = userString.substring(startIndex, startIndex+1); //front letter
            String lastLetter = userString.substring(lastIndex, lastIndex+1); //last letter
            //have to keep them both strings instead of chars so the equals method works

            if (firstLetter.equals(lastLetter)) {//if the letters are the same
                
                //need check if the length of the word is even or odd because check will differ
                
                if (userString.length() % 2 == 0) {//even length of letters
                    if (startIndex+1 == lastIndex) { //meets at middle
                        System.out.println("Your word is a palindrome."); 
                    } else {
                        isPalindrome(userString, startIndex+1, lastIndex-1);
                    }
                } else {  //odd length of letters
                    if (startIndex == lastIndex) {//stops at middle letter
                        System.out.println("Your word is a palindrome."); 
                    } else {
                        isPalindrome(userString, startIndex+1, lastIndex-1);
                    }
                }
               
            } else { //different letter, the word is not palindrome
                System.out.println("Your word is not a palindrome.");
            }
        }

    }


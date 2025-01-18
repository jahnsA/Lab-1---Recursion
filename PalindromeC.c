//W3 Schools C
//https://www.geeksforgeeks.org/tolower-function-in-c/?ref=ml_lbp
//https://www.programiz.com/c-programming/library-function/string.h/strlen
#include <stdio.h>
#include <ctype.h>
#include <string.h>
void isPalindromeHelper(int left, int right, char* word){
    if(left >= right){
        printf("%s is a palindrome.\n", word);
        return;
    }//end if
    if(word[left] != word[right]){
        printf("%s is not a palindrome.\n", word);
        return;
    }//end if
    isPalindromeHelper(left+1, right-1, word);
}//end isPalindromeHelper
void isPalindrome(char* word) {
    if(strlen(word) <= 1) {
        printf("%s is not a palindrome\n", word);
        return;
    }//end if statement
    isPalindromeHelper(0, strlen(word)-1, word);
}//end isPalindrome
int main(){
    //add user input and to lowercase here
    //TEST cases
    isPalindrome("a");
    isPalindrome("at");
    isPalindrome("dad");
    isPalindrome("tea");
    isPalindrome("toot");
    isPalindrome("book");
    isPalindrome("madam");
    isPalindrome("creak");
}//end main
//W3 Schools C
//https://www.geeksforgeeks.org/tolower-function-in-c/?ref=ml_lbp
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
//add in lower case word later
    if(strlen(word) <= 1) {
        printf("%s is not a palindrome\n", word);//fix to add string later
    }//end if statement
    isPalindromeHelper(0, strlen(word)-1, word);
}//end isPalindrome
int main(){
    isPalindrome("dad");
}
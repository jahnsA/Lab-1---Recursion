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
    int userInt;
    char word[20];
    do{
        printf("Enter a word and I will check if it's a palindrome:");
        scanf("%s", word);
        //turn to lowercase
        for(int i = 0; i < strlen(word); i++) {
            word[i] = tolower(word[i]);
        }//end for loop
        isPalindrome(word);
        printf("Enter 1 to continue or 0 to quit:");
        userInt = scanf("%d", userInt);
    } while(userInt != 0);
    

    //TEST cases
    /*isPalindrome("a");
    isPalindrome("at");
    isPalindrome("dad");
    isPalindrome("tea");
    isPalindrome("toot");
    isPalindrome("book");
    isPalindrome("madam");
    isPalindrome("creak");*/
}//end main
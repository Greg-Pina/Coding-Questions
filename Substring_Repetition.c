#include <stdio.h>

/**
 * Question: Given string A consisting of n characters and string B consisting of m characters
 * Return the number of times A must be stated such that B is a substring of the repeated A.
 * If B cannot be a substring of the repeated A, return -1
 */
int main() {
    //Search for subString A in B
    //If subString not found, return -1
    //If found, count characters to left of subString start
    //If found, count characters to right of subString start
    //If foundLeftCharacters < strlen(subString) && foundLeftCharacters != 0 | Counter++
    //If foundRightCharacters < strlen(subString) && foundRightCharacters != 0 | Counter++
    //If foundLeftCharacters > strlen(subString)
    //toAddToCounter = foundLeftCharacters / strlen(subString)
    //if foundRightCharacters > strlen(subString)
    //toAddToCounter = foundRightCharacters / strlen(subString)
    //Counter++ for original substring



    return 0;
}
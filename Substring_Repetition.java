import java.lang.*;
import java.io.*;
import java.util.*;

class Solution {
    public int solution(String A, String B) {
        //Search for subString A in B
        int end = B.indexOf(A);
        int ALength = A.length();
        int counter = 0;

        //If subString not found, return -1
        if (end == -1) {
            return -1;
        }

        //If found, count characters to left of subString start
        String leftString = B.substring(0, end);
        int foundLeftCharacters = leftString.length();

        //If found, count characters to right of subString start
        String rightString = B.substring(end, B.length());
        int foundRightCharacters = rightString.length();

        //If foundLeftCharacters < strlen(subString) && foundLeftCharacters != 0 | Counter++
        if (foundLeftCharacters < ALength && foundLeftCharacters != 0) {
            counter++;
        }
        //If foundRightCharacters < strlen(subString) && foundRightCharacters != 0 | Counter++
        if (foundRightCharacters < ALength && foundRightCharacters != 0) {
            counter++;
        }
        //If foundLeftCharacters > strlen(subString)
        if (foundLeftCharacters > ALength) {
            //toAddToCounter = foundLeftCharacters / strlen(subString)
            int toAdd = foundLeftCharacters / ALength;
            counter = counter + toAdd;
        }
        //if foundRightCharacters > strlen(subString)
        if (foundRightCharacters > ALength) {
            //toAddToCounter = foundRightCharacters / strlen(subString)
            int toAdd = foundRightCharacters / ALength;
            counter = counter + toAdd;
        }

        //Counter++ for original substring
        counter++;

        return counter;
    }
}
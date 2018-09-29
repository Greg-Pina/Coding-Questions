import java.lang.*;
import java.io.*;
import java.util.*;

class Solution {
    public String solution(String S, int K) {
        //Create a counter for iterating through the string to know when to append a '-'
        //Iterate through a reversed copy of the string to deal with appending '-' at the beginning
        //for groupings less than K
        //Reverse the returned string to get the correct result
        //Uppercase the string and return it

        //Create a reversed copy of the string S
        String SCopy = new StringBuilder(S).reverse().toString();

        //Create a new string for storing result
        String toReturn = new String();
        //Create a counter for the number of hyphens
        int counter = 0;
        //Go through the length of the string appending
        int length = SCopy.length();
        for (int i = 0; i < length; i++) {
            //If counter == K, append a -
            if (counter == K) {
                toReturn = toReturn + "-";
                counter = 0;
            }
            //If character at i isn't -, append it
            if (SCopy.charAt(i) != '-') {
                //Place into new string
                toReturn = toReturn + SCopy.charAt(i);
                counter++;
            }
        }

        //Reverse the returned copy
        String toReturnCopy = new StringBuilder(toReturn).reverse().toString();
        //Uppercase the string
        toReturnCopy = toReturnCopy.toUpperCase();
        //Return the result
        return toReturnCopy;
    }
}

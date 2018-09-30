# Coding-Questions

<h3>Substring_Repetition.java</h3>
Question: Given a string A consisting of n characters and a string B consisting of m characters, write a function that will 
return the number of times A must be stated such that B is a substring of the repeated A. 
If B can never be a substring, return -1.
Example:
A = ‘abcd’
B = ‘cdabcdab’
The function should return 3 because after stating A 3 times, getting ‘abcdabcdabcd’, B is now a substring of A.
You can assume that n and m are integers in the range [1, 1000]. 
Question link: https://www.geeksforgeeks.org/google-interview-experience-set-7-software-engineering-intern/

<h3>License_Key_Formatting.java</h3>
Question: Given a string S consisting of N characters and an integer K. S is composed of alphanumerical characters and/or dashes. 
The dashes split the alphanumerical characters within S into groups (i.e. if there are M dashes, the string is split into M+1 groups).
The dashes in S are possibly misplaced.
We want each group of characters to be of length K (except for possibly the first group, which could be shorter, 
but still must contain at least one character). To satisfy this requirement, we will reinsert the dashes. Additionally, 
all the lower case letters in S must be converted to upper case.
For example, in the license key "2-4A0r7-4k" there are two dashes which split it into three groups of lengths 1, 5 and 2, 
respectively. If we want each group to be of length 4, then we would have to reinsert the dashes. Thus, for K = 4, 
the correctly formatted string is "24A0-R74K".
Question link: https://leetcode.com/problems/license-key-formatting/description/
Issue: Code is not efficient - passes 34/38 test cases

<h3>Jewels_and_Stones.java</h3>
Question: You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
Each character in S is a type of stone you have. You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all characters in J and S are letters. 
Letters are case sensitive, so 'a' is considered a different type of stone from 'A'.
Question link: https://leetcode.com/problems/jewels-and-stones/description/

<h3>Merge_Trees.java</h3>
Question: Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees
are overlapped while the others are not. You need to merge them into a new binary tree. 
The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node.
Otherwise, the NOT null node will be used as the node of new tree.
Question link: https://leetcode.com/problems/merge-two-binary-trees/description/

<h3>Reverse_String.java</h3>
Question: Write a function that takes a string as input and returns the string reversed.
Question link: https://leetcode.com/problems/reverse-string/description/

/**
 Week 2: Recursion
 Sep 17, 2024

 0) Recursion

 A recursive function is a function that calls itself. When utilizing recursion to prevent a infinite loop you need a base case which is a condition to stop recalling the function. Whenever you make a recursive call you want to adjust the parameter to move closer to the base case.

 1) Sum of first n natural numbers

 Given a number n, find the sum of the first n natural numbers. To calculate the sum, we will use a recursive function recur_sum().

 Input : 3
 Output : 6
 Explanation : 1 + 2 + 3 = 6
 Input : 5
 Output : 15
 Explanation : 1 + 2 + 3 + 4 + 5 = 15
 2) First Uppercase Letter

 Given a string, find its first uppercase letter. You may use a recursive helper method.

 Input : geeksforgeeKs
 Output : K
 Input  : geekS
 Output : S
 3) Reverse String

 Given a string, return its reverse string counterpart.

 Input: “Welcome to PANDA”
 Output: “ADNAP ot emocleW”
 4) Fibonacci

 The Fibonacci numbers, commonly denoted F(n), form a sequence called the Fibonacci sequence. Each number in this sequence is the sum of the two preceding ones, starting from 0 and 1.

 Input: 2
 Output: 1
 Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 Input: 3
 Output: 2
 Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 Recursive:
 Time: O(2^n)
 Space: O(n)
 Iterative Array:
 Time: O(n)
 Extra: O(n)
 Iterative Variable:
 Time: O(n)
 Extra: O(1)
 Mathematical:
 Time: O(1)
 Extra: O(1)
 5) Tower of Hanoi

 A peg contains rings in sorted order, with the largest ring being the lowest. There are three pegs, the initial peg, the destination peg, and a buffer peg. The destination and buffer pegs start off empty, and the initial peg has n rings on it. You are to transfer these rings to the destination peg. The only operation you can perform is taking a single ring from the top of one peg and placing it on top of another peg. You cannot place a larger ring above a smaller one. Write a function which, given n (the number of rings on the initial peg), return the number of steps it would take to move all the rings from the initial peg to the destination peg.

 TOH

 Input: n = 3
 Output: 7
 0th to 1st -> 0th to 2nd -> 1st to 2nd -> 0th to 1st -> 2nd to 0th -> 2nd to 1st -> 0th to 1st
 */
public class recursion {
}

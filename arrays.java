/**
Week 1: Arrays
Sep 10, 2024

        1) Build Array from Permutations

Given an array (nums) of n positive integers (0 through n-1), build a new array (ans) of the same length where ans[i] = nums[nums[i]].

Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
        = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
        = [0,1,2,4,5,3]
Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
        = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
        = [4,5,0,1,2,3]
        2) Keyboard Rows

Keyboards have 3 rows of characters:

the first row consists of the characters “qwertyuiop”
the second row consists of the characters “asdfghjkl”
the third row consists of the characters “zxcvbnm”
Given an array of Strings, return an array of words that can be spelt with just one keyboard row.

        Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Input: words = ["omk", "asdf"]
Output: ["asdf"]
        3) Max Consecutive Ones

Given a binary array (nums), return the maxmum number of consecutives 1’s in the array.

Input: nums = [1,1,0,1,1,1]
Output: 3
Input: nums = [1,0,1,1,0,1]
Output: 2
        4) Maximum Subarray

Given an integer array (nums), find the contiguous subarray) with the largest sum, and return its sum.

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Input: nums = [1]
Output: 1
Input: nums = [5,4,-1,7,8]
Output: 23
*/

public class arrays {

}

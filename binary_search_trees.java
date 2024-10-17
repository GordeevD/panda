/**
 Week 6: Binary Search Trees
 Oct 16, 2024

 0) What is a BST?

 Binary Search Trees (BSTs) are binary trees with the following properties:

 The left subtree of a node (the left child and all of its children) have values less than the parent node
 The right subtree of a node (the right child and all of its children) have values greater than the parent node
 Both the left and right subtrees are also BSTs
 BST:                           Not BST:
 4                                    1
 / \                                  / \
 2   5                                2   3
 / \                                  / \
 1   3                                4   5
 1) Find Element in BST

 Given the root of a BST and a desired value, return true if the value is in the BST, and false if it is not.

 Input: BST = 6     Value = 2
 / \
 4   7
 / \   \
 3   5   9
 /       /
 1       8

 Output: false
 Input: BST = 6     Value = 8
 / \
 4   7
 / \   \
 3   5   9
 /       /
 1       8

 Output: true
 Time Complexity: O(lgn)		// O(n) brute force
 Space Complexity: O(1)
 2) Is Valid BST?

 Give the root of a binary tree, return true if it is also a BST, false if it is not.

 A valid BST is defined as follows:

 The left subtree of a node contains only nodes with keys less than the node’s key.
 The right subtree of a node contains only nodes with keys greater than the node’s key.
 Both the left and right subtrees must also be binary search trees.
 Input: BST = 4
 / \
 2   5
 / \   \
 1   3   6

 Output: true
 Input: BST = 3
 / \
 1   4
 / \   \
 -1   0   6

 Output: false (0 < 1)
 Time Complexity: O(n)
 Space Complexity: O(1)
 3) Convert Sorted Array to BST

 Given nums (an array of sorted ints, in ascending order), return a height-balanced BST (the height of the left and right subtree of every node differs by at most 1).

 Input: nums = [-10,-3,0,5,9]
 Output: BST = 0
 / \
 -3   9
 /   /
 -10  5
 Input: nums = [1,3]
 Output BST = 1       OR     BST = 3
 \                  /
 3                1
 Time Complexity: O(n)
 Space Complexity: O(n)
 4) Convert BST to Greater Tree

 Given the root of a BST, convert it to a Greater Tree. A greater tree is a tree such that every value of the original BST is changed to the original value plus the sum of all values greater than the original value in BST.

 Input: BST = 4
 / \
 2   6
 / \
 0   3

 Output: BST = 10
 / \
 15   6
 / \
 15   13
 Time Complexity: O(n)		// Brute force O(n^2)
 Space Complexity: O(n)
 HARD

 5) Delete a node in a BST

 Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.

 Input: root = [5,3,6,2,4,null,7], key = 3
 5
 / \
 3   6
 / \   \
 2   4   7
 Output: [5,4,6,2,null,null,7]
 5
 / \
 4   6
 /     \
 2       7
 6) Trim a Binary Search Tree

 Given the root of a binary search tree and the lowest and highest boundaries as low and high, trim the tree so that all its elements lies in [low, high]. Trimming the tree should not change the relative structure of the elements that will remain in the tree (i.e., any node’s descendant should remain a descendant). It can be proven that there is a unique answer.

 Return the root of the trimmed binary search tree. Note that the root may change depending on the given bounds.

 Input: root = [3,0,4,null,2,null,null,1], low = 1, high = 3
 3
 / \
 0  4
 \
 2
 /
 1

 Output: [3,2,null,1]
 3
 /
 2
 /
 1
 */
public class binary_search_trees {
}

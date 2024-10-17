/**
 Week 5: Binary Trees
 Oct 9, 2024

 0) What are binary trees?

 Node class (.left, .right, .value) Root nodes (like head nodes with LLs, but for the top of the tree) Leaf nodes (nodes with no left or right nodes) Height/Depth (# of nodes between root and leaves)

 1) In-Order Traversal Printing

 Print the content of a binary tree, using in-order traversal. Given: Root node

 Input:    2
 / \
 1   4
 / \
 3   5

 Output: 1,2,3,4,5
 Time: O(n)
 Space: O(1)
 2) Post-Order Traversal Printing

 Print the content of a binary tree, using post-order traversal. (Bonus: Modify the code to do pre-order traversal afterwards) Given: Root node

 Input:    5
 / \
 1   4
 / \
 2   3

 Output: 1,2,3,4,5
 Time: O(n)
 Space: O(1)
 3) Binary Leaves List

 Form a singly linked list from the leaves (bottom nodes) of a binary tree.

 Input:    2
 / \
 1   4
 / \
 3   5

 Output: 1 -> 3 -> 5
 Time: O(n)
 Space: O(n)
 ~~ HARD ~~

 4) Check Balanced Binary Tree

 A balanced tree is a tree whose left sub-tree and right-tree have a height difference of 1 (or 0). Given a root node, return true if the tree is balanced, false otherwise.

 Input:     1
 / \
 2   3
 /
 4
 Output: True
 Input:    1
 / \
 2   3
 /
 4
 \
 5
 Output: False
 Time: O(n)		// Brute force is O(nlgn)
 Space: O(1)
 5) Validate a BST

 Given the root of a binary tree, determine if it is a valid binary search tree (BST).

 A valid BST is defined as follows:

 The left subtree of a node contains only nodes with keys less than the node’s key.
 The right subtree of a node contains only nodes with keys greater than the node’s key.
 Both the left and right subtrees must also be binary search trees.
 Input: root = [2,1,3]
 2
 / \
 1   3
 Output: true
 Input: root = [5,1,4,null,null,3,6]
 5
 / \
 1   4
 / \
 3   6
 Output: false
 Time: O(n)
 Space: O(1)
 */
public class binary_trees {
}

/**
 Week 3: Linked Lists
 Sep 24, 2024

 0) Operations of Single LLs

 Node { node next; int value; }

 Node.next = pointer to next node Node.value = value of node

 Head: first node in list Tail: last node in list (Node.next = NULL)

 1) Remove Kth node from Single LL

 Given a linked list, remove the k-th node of the list and return its head.

 Input: 1->2->3->4->5, and k = 2.
 Output: link list 1->2->4->5.
 Input: 1->3->5->7, and k = 0.
 Output: linked list 3->5->7
 2) Remove Kth node from end of Single LL

 Given a linked list, remove the k-th node from the end of the list and return its head.

 Input: 1->2->3->4->5, and k = 1.
 Output: linked list 1->2->3->5.
 Input: 1->2->3, and k = 0
 Output: linked list 1->2
 3) Merge 2 sorted LL

 Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

 Input: 1->2->4, 1->3->4
 Output: 1->1->2->3->4->4
 –HARD–

 4) Rotate LL

 Given the head of a linked list, rotate the list to the right by k places.

 Input: head = [1,2,3,4,5], k = 2
 Output: [4,5,1,2,3]
 Input: head = [0,1,2], k = 4
 Output: [2,0,1]
 5) Add Two Numbers

 You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Input: l1 = [2,4,3], l2 = [5,6,4]
 Output: [7,0,8]
 Explanation: 342 + 465 = 807
 Input: l1 = [0], l2 = [0]
 Output: [0]
 Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 Output: [8,9,9,9,0,0,0,1]
 Constraints:

 The number of nodes in each linked list is in the range [1, 100].
 0 <= Node.val <= 9
 It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class linked_lists {
}

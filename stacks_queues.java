/**
 Week 4: Stacks & Queues
 Oct 1, 2024

 Q
 Q
 Q
 Q
 Q
 Q
 A stack of Q’s 😉

 Stack: first in, last out (FILO)

 METHOD	DESCRIPTION
 empty()	Returns true if the stack is empty. Else, returns false.
 peek()	Returns the element on the top of the stack, but does not remove it.
 pop()	Removes and returns the top element of the stack. Depending on the language and implementation, an error may be thrown if pop() is called when the stack is empty.
 push(element)	Pushes element to the top of the stack.
 Example

 import java.util.Stack;

 public class StackExample {
 public static void main(String[] args) {
 // Create a Stack
 Stack<Integer> stack = new Stack<>();

 // Push elements onto the stack
 stack.push(1);
 stack.push(2);
 stack.push(3);
 stack.push(4);

 // stack = [1, 2, 3, 4]

 boolean empty = stack.empty();
 // empty = false

 // Peek at the top element without removing it
 Integer topOfStack = stack.peek();
 // topOfStack = 4
 // stack = [1, 2, 3, 4]

 // Pop element from the stack
 Integer popped = stack.pop();
 // popped = 4
 // stack = [1, 2, 3]

 popped = stack.pop();
 // popped = 3
 // stack = [1, 2]
 }
 }
 Queue: first in, first out (FIFO)

 METHOD	DESCRIPTION
 peek()	Returns the element at the front of the queue, but does not remove it.
 poll()	Removes and returns the front element of the queue or null.
 offer(element)	Pushes element to the front of the queue.
 Example

 import java.util.LinkedList;
 import java.util.Queue;

 public class QueueExample {
 public static void main(String[] args) {
 // Create a Queue using LinkedList
 Queue<Integer> queue = new LinkedList<>();

 // Enqueue elements
 queue.offer(1);
 queue.offer(2);
 queue.offer(3);
 queue.offer(4);

 // queue = [1, 2, 3, 4]

 // Peek at the front element without removing it
 Integer frontOfQueue = queue.peek();
 // frontOfQueue = 1
 // queue = [1, 2, 3, 4]

 // Dequeue elements
 Integer dequeuedElement = queue.poll();
 // dequeuedElement = 1
 // queue = [2, 3, 4]

 dequeuedElement = queue.poll();
 // dequeuedElement = 2
 // queue = [3, 4]
 }
 }

 1) Is Palindrome

 Given a string, return true if the string is a palindrome, false if not. A palindrome is a word that is the same forward and backward (ex: kayak, racecar)

 Input: racecar
 Output: true
 Input: palindrome
 Output: false
 2) Valid Parentheses

 Given a string s containing just the characters ‘(‘, ‘)’, ‘{‘, ‘}’, ‘[’ and ‘]’, determine if the input string is valid.

 Valid Characters: (){}[]
 An input string is valid if:

 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
 Input: s = "()"
 Output: true
 Input: s = "()[]{}"
 Output: true
 Input: s - "{[()]}"
 Output: true
 Input: s = "([{"
 Output: false
 Input: s = "()[{]}"
 Output: false
 3) Use a stack to make a queue / Use a queue to make a stack

 Create a stack out of queues, or a queue out of stacks.
 If you are making a stack, you can use multiple queues, and vice versa.
 Assume that only positive integers will be added.
 STARTER CODE

 class Solution {
 // HINT: You may want to initialize some variables here!

 public void push(int num) { }

 public int pop() { }

 public int peek() { }

 public boolean isEmpty() { }
 }
 TEST CASES

 MyStack myStack = new MyStack();     // uses queues
 myStack.push(1);       // [1]    → returns nothing
 myStack.push(2);       // [2, 1] → returns nothing
 myStack.peek();        // [2, 1] → returns 2
 myStack.pop();         // [2]    → returns 2
 myStack.isEmpty();     // returns False

 MyQueue myQueue = new MyQueue();     // uses stacks
 myQueue.push(1);       // [1]    → returns nothing
 myQueue.push(2);       // [1, 2] → returns nothing
 myQueue.peek();        // [1, 2] → returns 1
 myQueue.pop();         // [2]    → returns 1
 myQueue.isEmpty();     // returns False

 Solution mySolution = new Solution();
 mySolution.peek();     // [] → returns -1
 mySolution.pop();      // [] → returns -1
 4) Binary Tree to Proper Array Notation

 Given a root node of a binary tree, create and return an array representation of the tree.

 Input: head and size of tree Output: array

 Input: [a], 7
 a
 / \
 b   c
 / \ / \
 d  e f  g
 Output: [a,b,c,d,e,f,g]
 5) In-order, pre-order, post-order traversal of BST using only queues/stacks

 exactly as it sounds

 ##HARD

 6) Simplify Path

 Given a string path, which is an absolute path (starting with a slash ‘/’) to a file or directory in a Unix-style file system, convert it to the simplified canonical path.

 In a Unix-style file system, a period ‘.’ refers to the current directory, a double period ‘..’ refers to the directory up a level, and any multiple consecutive slashes (i.e. ‘//’) are treated as a single slash ‘/’. For this problem, any other format of periods such as ‘…’ are treated as file/directory names.

 The canonical path should have the following format:

 The path starts with a single slash '/'.
 Any two directories are separated by a single slash '/'.
 The path does not end with a trailing '/'.
 The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
 Return the simplified canonical path.

 Input: path = "/home//foo/"
 Output: "/home/foo"
 Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
 Input: path = "/home/"
 Output: "/home"
 Explanation: The trailing slash should be removed.
 Input: path = "/home/user/Documents/../Pictures"
 Output: "/home/user/Pictures"
 Explanation: A double period ".." refers to the directory up a level (the parent directory).
 Input: path = "/E/a/../b/c/../d/./"
 Output: "/E/b/d"
 Explanation: A single period '.' represents the current directory.
 */
public class stacks_queues {
}

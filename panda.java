public static void main(String[] args) {
    // 2. Is Valid BST?
    Solution2 solution = new Solution2();
    // Creating the first example tree:
    //        4
    //       / \
    //      2   5
    //     / \   \
    //    1   3   6
    TreeNode root1 = new TreeNode(4);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(5);
    root1.left.left = new TreeNode(1);
    root1.left.right = new TreeNode(3);
    root1.right.right = new TreeNode(6);

    System.out.println("Is the first tree a valid BST? " + solution.isValidBST(root1)); // Expected: true

    // Creating the second example tree:
    //        3
    //       / \
    //      1   4
    //     / \   \
    //   -1   0   6
    TreeNode root2 = new TreeNode(3);
    root2.left = new TreeNode(1);
    root2.right = new TreeNode(4);
    root2.left.left = new TreeNode(-1);
    root2.left.right = new TreeNode(0);
    root2.right.right = new TreeNode(6);

    System.out.println("Is the second tree a valid BST? " + solution.isValidBST(root2)); // Expected: false


}
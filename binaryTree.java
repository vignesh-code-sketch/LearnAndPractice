// BinaryTree concept full notes: 
// 1. A binary tree is a hierarchical data structure in which each node has at most two children, referred to as the left child and the right child.
// 2. The topmost node of the binary tree is called the root, and nodes with no children are called leaves.
// 3. Binary trees can be classified into different types, such as full binary trees (every node has either 0 or 2 children), complete binary trees (all levels are fully filled except possibly the last level, which is filled from left to right), and perfect binary trees (all internal nodes have two children and all leaves are at the same level).
// 4. Common operations on binary trees include insertion, deletion, traversal (pre-order, in-order, post-order), and searching for elements.
// 5. The time complexity for insertion, deletion, and searching in a binary tree is O(h), where h is the height of the tree. In a balanced binary tree, the height is O(log n), while in an unbalanced binary tree, the height can be O(n).
// 6. The space complexity of a binary tree is O(n) in the worst case, where n is the number of nodes in the tree, due to the need to store references for each node.
// 7. Binary trees are widely used in various applications, such as expression parsing, binary search trees (BSTs), heaps, and Huffman coding trees.
// 8. Example use cases for binary trees include representing hierarchical data (like organizational charts), implementing efficient searching and sorting algorithms, and managing dynamic sets of data.

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TreeNode root;

    // Method to insert a new node in the binary tree
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    // Method to perform in-order traversal of the binary tree
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void preorder() {
        preorderRec(root);
    } 

    private void preorderRec(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void postorder() {
        postorderRec(root);
    } 

    private void postorderRec(TreeNode root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }  

    private boolean searchRec(TreeNode root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        return searchRec(root.left, key) || searchRec(root.right, key);
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private TreeNode deleteRec(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    private int minValue(TreeNode root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
}


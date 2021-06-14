package Praktikum8_BinaryTree;

public class No1_BinaryTreeApp {
   public static void main (String[] args) {
        System.out.println("Fika Nur Hasari - 21092001");
        System.out.println("No.1 Binary Tree App");
        
        BinaryTree tree = new BinaryTree();
        
        TreeNode node;
        
        node = new TreeNode ('D');
        tree.insert (node);
        
        node = new TreeNode ('B');
        tree.insert (node);
        
        node = new TreeNode ('A');
        tree.insert (node);
        
        node = new TreeNode ('C');
        tree.insert (node);
        
        node = new TreeNode ('F');
        tree.insert (node);
        
        node = new TreeNode ('E');
        tree.insert (node);
        
        node = new TreeNode ('G');
        tree.insert (node);
        
        System.out.print("Traversal dengan preorder :");
        tree.preOrder();
        
        System.out.print("\nTraversal dengan postorder :");
        tree.postOrder();
        
        System.out.print("\nTraversal dengan inorder :");
        tree.inOrder();
        
        System.out.println();
    }
}
 


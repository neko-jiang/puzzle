import java.util.Stack;
public class Inordertraversal{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x) { val = x; } 
        
    }
    public static void inorder( TreeNode root)
    {
        if (root == null) return;
        Stack<TreeNode> s = new Stack<TreeNode> ();
        while (!s.empty() || root != null)
        {
            /*keep push the left child, will end up push null into stack*/
            if (root != null)
            {
                s.push(root);
                root = root.left; 
            }
            else
            {
                /*when current node is null,pop the element from stack*/
                TreeNode t = s.pop();
                System.out.println(t.val + " ");
                /* push right child to stack if exist*/
                if (t.right != null) s.push(t.right);
            }
        }
    }

       public static void preorder( TreeNode root)
        {
            if (root == null) return;
            Stack<TreeNode> s = new Stack<TreeNode> ();
            s.push(root);

            while (!s.empty() )
            {
                TreeNode t = s.pop();
                System.out.println(t.val + " ");
                if (t.right != null)
                {
                    s.push(t.right);
                }
                if (t.left != null)
                {
                    s.push(t.left);
                }
                /*push all left child into stack*/
                
            }
        }

    /*two stack solution*/
        public static void postorder( TreeNode root)
        {
            if (root == null) return;
            Stack<TreeNode> s = new Stack<TreeNode> ();
            Stack<TreeNode> r = new Stack<TreeNode> ();
            s.push(root);
            while (!s.empty())
            {
                root = s.pop();
                r.push(root);
                if (root.left != null) s.push(root.left);
                if (root.right != null) s.push(root.right);
                
            }
            while (!r.empty())
            {
                TreeNode t = r.pop();
                System.out.println(t.val + " ");
            }
        }

     public static void main(String []args){
        TreeNode root = new TreeNode (1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        TreeNode l_child = root.left;
        TreeNode r_child = root.right;
        l_child.left = new TreeNode(4);
        l_child.right = new TreeNode(5);
        Inordertraversal obj = new Inordertraversal();
        obj.inorder(root);
        System.out.println("Hello World");
     }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return compare(root.left, root.right);
        
    }
    boolean compare(TreeNode root1, TreeNode root2)
    {
        if (!is_samenode(root1, root2))
        {
            return false;
        }
        else if (root1 == null && root2 == null)
        {
            return true;
        }
        boolean r1 = compare(root1.left, root2.right);
        boolean r2 = compare(root1.right, root2.left);
        
        boolean res = r1 && r2;
        return res;
    }
        
    boolean is_samenode(TreeNode root1, TreeNode root2)
    {
        boolean res = false;
        if (root1 == null && root2 == null)
        {
            res = true;
        }
        else if (root1 != null && root2 != null && root1.val == root2.val)
        {
            res = true;
        }
        return res;    
    }
}

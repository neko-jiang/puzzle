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
        Queue<TreeNode> qe=new LinkedList<TreeNode>();
        qe.add(root.left);
        qe.add(root.right);
        while(qe.size() != 0)
        {
            TreeNode s1 = qe.poll();
            TreeNode s2 = qe.poll();
            if (!is_samenode(s1,s2)) return false;
            if (s1 != null && s2!= null)
            {
                qe.add(s1.left);
                qe.add(s2.right);
                qe.add(s1.right);
                qe.add(s2.left);
            }
        }

        return true;
    }
    boolean is_samenode(TreeNode r1, TreeNode r2)
    {
        if (r1 == null && r2 == null) return true;
        if (r1 != null && r2 != null && r1.val == r2.val) return true;
        return false;
    }

        
}

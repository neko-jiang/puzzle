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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        Stack<TreeNode> s = new Stack<TreeNode>();
        if (root == null) return 0;
        s.push(root);
        while(!s.empty())
        {
            root = s.pop();
            TreeNode l_child = root.left;
            /*find left leave*/
            if (l_child != null && l_child.right == null && l_child.left == null)
            {
                sum = sum + l_child.val;
            }
            else if (root.left != null) s.push(root.left);
            if (root.right != null) s.push(root.right);
      
        }
        return sum;
    }
    

}

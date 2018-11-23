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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> s1 = new ArrayList <Integer> ();
        ArrayList<Integer> s2 = new ArrayList <Integer> ();
        getleaf(root1, s1);
        getleaf(root2, s2);
        if (s1.size() != s2.size()) return false;
        return s1.equals(s2);
    }
    /*create a function to get leaf sequence*/
    public void getleaf(TreeNode root, ArrayList<Integer> res)
    {
        if (root == null) return;
        if ( root.left == null && root.right == null)
        {
            res.add(root.val);
        }
        getleaf(root.left, res);
        getleaf(root.right, res);
        
    }
}

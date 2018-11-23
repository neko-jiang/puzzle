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
        ArrayList<Integer> s1 = getleaf(root1);
        ArrayList<Integer> s2 = getleaf(root2);
        return s1.equals(s2);
    }
    /*create a function to get leaf sequence*/
    public ArrayList<Integer> getleaf(TreeNode root)
    {
        ArrayList<Integer> aa = new ArrayList<Integer> ();
        if (root == null) return aa;
        if (root.left == null && root.right == null)
        {
            aa.add(root.val);
            return aa;
        }
        ArrayList<Integer> ll = getleaf(root.left);
        for (Integer t: ll)
        {
            aa.add(t);
        }
        ArrayList<Integer> rr = getleaf(root.right);
        for (Integer t: rr)
        {
            aa.add(t);
        }
        
        return aa;
        
    }
}

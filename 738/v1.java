tion for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int minDiffInBST(TreeNode root) {
        List<Integer> l = new ArrayList<Integer> ();
        inorder(root, l);
        if (l.size() == 0) return 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < l.size(); i++)
        {
            int t = l.get(i)-l.get(i-1);
            min = Math.min(min, t);
        }
        return min;
    }
    void inorder(TreeNode root, List<Integer> l)
    {
        if (root == null) return;
        inorder(root.left, l);
        l.add(root.val);
          inorder(root.right, l);
    }
}

/*This could be faster*/
/*Think of how you can compare on the way instead of saving the result to a list and compare later*/

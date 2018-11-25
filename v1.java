tion for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>> ();
        level_traversal(root, 1, res);
        return res;
    }
    void level_traversal(TreeNode root, int level, List<List<Integer>> res)
    {
        if (root == null) return;
        /*this means the index has not been created yet in the array list*/
        if (res.size() < level) 
        {
            /*List<Integer> s = new ArrayList<Integer>();*/
            List<Integer> list = new ArrayList<Integer>();
            list.add(root.val);
            res.add(list);
        }
        else
        {
            List<Integer> t = res.get(level-1);
            t.add(root.val);
        }
        level_traversal(root.left, level+1, res);
        level_traversal(root.right, level+1, res);
            
            
    }
}

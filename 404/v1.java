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
        if (root == null) return 0;
        if (isleaf(root.left))
            sum = root.left.val;
        else 
            sum =  sumOfLeftLeaves(root.left);
        if (isleaf(root.right)) sum = sum; /*keep the value from the left child*/
        else
            sum = sum + sumOfLeftLeaves(root.right); /*add on to the value from the left child*/
        return sum;
    }
    public boolean isleaf(TreeNode root)
    {
        if (root != null && root.left == null && root.right == null)
        {
            return true;
        }
        return false;
    }
}

/*mistake:
when it comes to recursion function, fail to think below clearly:
1. what's the ending condition
2. how to use the return value from the base condition?

how to make things right?
take one example and see how each steps works?
for example, what's the stop condition in this example?
when return the value to the previous calling function, in the real example, how do you caculate and return them back? 


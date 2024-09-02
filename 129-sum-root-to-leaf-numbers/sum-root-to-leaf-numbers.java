/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        return getSum(root, 0);
    }
    
    public int getSum(TreeNode root, int prev) {
        
        if(root.left == null && root.right == null) {
            // hit a leaf node
            return prev + root.val;
        }
        
        int lResult = 0, rResult = 0;
        
        if(root.left != null) lResult = getSum(root.left, (prev + root.val) * 10);
        if(root.right != null) rResult = getSum(root.right, (prev + root.val) * 10);     
        
        return lResult + rResult;
    }
}
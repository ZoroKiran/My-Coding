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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if(root == null) return res;
        Stack<TreeNode> st = new Stack<>();
        st.add(root);
        while(!st.isEmpty()) {
            TreeNode cur = st.pop();
            res.add(0, cur.val);
            if(cur.left != null) {
                st.add(cur.left);
            }
            if(cur.right != null) {
                st.add(cur.right);
            }
        }
        return res;
    }
}

/*
Question: Given a binary tree, return the postorder traversal of its nodes' values.
Question link: https://leetcode.com/problems/binary-tree-postorder-traversal/description/
*/
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> toReturn = new ArrayList<>();
        addValuesToList(root, toReturn);
        return toReturn;
    }
    
    private void addValuesToList(TreeNode node, List<Integer> toReturn) {
        if (node != null) {
            addValuesToList(node.left, toReturn);
            addValuesToList(node.right, toReturn);
            toReturn.add(node.val);
        }
    }
}

public class Solution {

    private static class TreeNode {
        char val;
        TreeNode left;
        TreeNode right;

        TreeNode(char val) {
            this.val = val;
        }
    }

    //根据二叉树创建字符串
    // 左右都为空
    // 左不为空，右为空
    // 左为空，右不为空，不能省略
    public static String _tree2str(TreeNode t) {
        String s = "";
        if (t != null) {
            s += "(";
            s += t.val;
            if (t.left == null && t.right == null) {
            } else if (t.left == null && t.right != null) {
                s += "()";
                s += _tree2str(t.right);
            } else if (t.left != null && t.right == null) {
                s += _tree2str(t.left);
            } else {
                s += _tree2str(t.left);
                s += _tree2str(t.right);
            }
            s += ")";
        }
        return s;
    }
    public static String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        String s = _tree2str(t);
        return s.substring(1, s.length() - 1);
    }
}

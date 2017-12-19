public class IsSymmetrical{

    public boolean solution(TreeNode pRoot){
        if(pRoot == null) return true;
        return comTree(pRoot.left, pRoot.right);
    }

    public boolean comTree(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;

        if(left != null && right != null)
            return left.val == right.val && comTree(left.right, right.left) && comTree(left.left, right.right);
        return false;
    }
}

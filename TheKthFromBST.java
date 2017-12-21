import java.util.ArrayList;

public class TheKthFromBST{

public class Solution {

    private ArrayList<TreeNode> list = new ArrayList<TreeNode>();

    TreeNode KthNode(TreeNode pRoot, int k)
    {
        run(pRoot);
        if(k <= 0 || k > list.size()) return null;
        return list.get(k-1);
    }

    public void run(TreeNode pRoot){
        if(pRoot != null){
            run(pRoot.left);
            list.add(pRoot);
            run(pRoot.right);
        }
    }
}
}

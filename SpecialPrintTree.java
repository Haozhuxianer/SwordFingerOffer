import java.util.ArrayList;
import java.util.LinkedList;
public class SpecialPrintTree{

    private LinkedList help = new LinkedList<TreeNode>();
    private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if(pRoot == null) return result;
        help.add(pRoot);
        boolean flag = false;
        ArrayList curRow = new ArrayList<Integer>();
        while(help.size() > 0){
            int len = help.size();
            for(int i = 0; i < len; i++){
                TreeNode temp = (TreeNode)help.poll();
                curRow.add(temp.val);
                if(temp.left != null){
                    help.add(temp.left);
                }
                if(temp.right != null){
                    help.add(temp.right);
                }
            }
            if(flag){
                ArrayList rev = new ArrayList<Integer>();
                for(int i = curRow.size()-1; i >= 0; i--)
                    rev.add(curRow.get(i));
                result.add(rev);
            }else{
                result.add(curRow);
            }
            flag = !flag;
            curRow = new ArrayList<Integer>();
        }
        return result;
    }

    public static void main(String[] args){
        //test
    }
}

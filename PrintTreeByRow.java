public class PrintTreeByRow{
    private LinkedList queue = new LinkedList<TreeNode>();
    private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        if(pRoot == null) return result;
        queue.add(pRoot);
        while(queue.size() > 0){
            int len = queue.size();
            ArrayList row = new ArrayList<Integer>();
            for(int i = 0; i < len; i++){
                TreeNode cur = (TreeNode)queue.poll();
                row.add(cur.val);
                if(cur.left != null) queue.add(cur.left);
                if(cur.right != null) queue.add(cur.right);
            }
            result.add(row);
            row = new ArrayList<Integer>();
        }
        return result;
    }

    public static void main(String[] args){
        //test
    }
}

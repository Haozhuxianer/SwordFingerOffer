public class GetNextInTree{

    public TreeLinkNode solution(TreeLinkNode pHead){
        if(pHead == null) return null;
        if(pHead.right != null){
            pHead = pHead.right;
            while(pHead.left != null) pHead = pHead.left;
            return pHead;
        }
        while(pHead.next != null){
            TreeLinkNode pRoot = pHead.next;
            if(pRoot.left == pHead) return pRoot;
            pHead = pHead.next;
        }
        return null;
     }

    public static void mian(String[] args){
        GetNextInTree g = new GetNextInTree();
        g.solution(TreeLinkNode(1));
    }
}

public class TreeLinkNode{
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val){
            this.val = val;
        }
    }

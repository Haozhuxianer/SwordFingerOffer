public class DeleteDuplication{

    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode solution(ListNode pHead){
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode head = new ListNode(-2);
        head.next = pHead;
        ListNode p = head;
        ListNode q = head.next;
        while(q != null){
            while(q.next != null && q.next.val = q.val) q = q.next;
            if(p.next != q){
                p = q;
                q = q.next;
            }else{
                q = q.next;
                p.next = q;
            }
        }
        return head.next;
    }

    public static void main(String[] args){
        DeleteDuplication d = new DeleteDuplication();
        ListNode l = d.solution();
        while(pHead.next != null){
            System.out.println(pHead.val);
        }
    }
}

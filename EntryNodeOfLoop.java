import java.util.ArrayList;
public class EntryNodeOfLoop{

    class ListNode{
        int value;
        ListNode next = null;

        listNode(int value){
            this.value = value;
        }
    }

    public ListNode solution(ListNode pHead){
        ArrayList note = new ArrayList();
        while(pHead.next != null){
            if(note.contains(pHead.value)){
                return pHead;
            }else{
                note.add(pHead.value);
                pHead = pHead.next;
            }
        }
        return null;
    }

    public static void main(String[] args){
        EntryNodeOfLoop  e = new EntryNodeOfLoop();
        ListNode result = e.solution();
        while(result.next != null){
            System.out.println(result.value);
            result = result.next;
        }
    }
}

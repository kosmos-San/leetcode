/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode p1,p2;
        p1=null;
        p2=head;

        while(p2!=null&&p2.val==val)
        {
            head=p2.next;
            p1=p2;
            p2=p2.next;
        }

        while(p2!=null){
            if(p2.val==val){
                p1.next=p2.next;
                p2.next=null;
                p2=p1.next;
            }else{
                p1=p2;
                p2=p2.next;
            }
        }
      
        return head;
    }

}

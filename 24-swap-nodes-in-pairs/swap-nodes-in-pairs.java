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
    public ListNode swapPairs(ListNode head) {
        ListNode p1,p2,p3,p4,p5;
        if(head==null||head.next==null){
            return head;
        }
        p5=head.next;
        p1=null;
        p2=head;
        p3=head.next;
        while(p2!=null&&p2.next!=null){
            //swap logic
            p4=p3.next;
            p3.next=p2;
            p2.next=p4;
            if(p1!=null){
                p1.next=p3;
            }
            // next node swap
            p1=p2;
            p2=p4;
            if(p4!=null){
                p3=p4.next;
            }
            
            
        }
        return p5;
        
    }
}
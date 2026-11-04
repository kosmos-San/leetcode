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
    public ListNode middleNode(ListNode head) {
       if(head==null){
        return head;
       } 

       int size=0;
       ListNode p1=head;
       ListNode p2=head;
       while(p2.next!=null&&p2.next.next!=null){
        p1=p1.next;
        p2=p2.next.next;
        
       }
        if(p2.next==null){
            return p1;
        }
        return p1.next;
    }
}
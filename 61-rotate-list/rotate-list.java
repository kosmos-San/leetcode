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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        int size=1;
        ListNode p1=head,p2,p3;
        while(p1.next!=null){
            size++;
            p1=p1.next;
        }
        p1=head;
        p2=null;
        k=k%size;
        int ele=0;
        if(k==0){
            return head;
        }

        while(ele!=size-k){
            p2=p1;
            p1=p1.next;
            ele++;
        }
        p2.next=null;
        p3=p1;
        while(p3.next!=null){
            p3=p3.next;
        }
        p3.next=head;
        return p1;

    }
}
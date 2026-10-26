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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1=new ListNode();
        p1=head;
        int size=1;
        while(p1.next!=null){
            p1=p1.next;
            size++;
        }

        int remove=size-n+1;
        ListNode p2=new ListNode();
        ListNode p3=new ListNode();
        p1=null;
        p2=head;
        int Ssize=1;
        while(Ssize!=remove){
            p1=p2;
            p2=p2.next;
            Ssize++;
        }
        if(remove==1){
            head=head.next;
            return head;
        }
        
        if(remove==size){
            p1.next=null;
            return head;
        }

        p1.next=p2.next;
        return head;
        

        }
       


    }

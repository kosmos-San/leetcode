class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || head.next == null || left == right) {
            return head;
        }

        int st = 1;

        ListNode p1 = null;
        ListNode p2 = head;
        ListNode p3, p4, p5;

        while(st != left) {
            p1 = p2;
            p2 = p2.next;
            st++;
        }

        
        p5 = p2;

        p3 = p2.next;

        while(st != right) {
            p4 = p3.next;
            p3.next = p2;
            p2 = p3;
            p3 = p4;
            st++;
        }

        // Reconnect the reversed section
        p5.next = p3;

        if(p1 != null) {
            p1.next = p2;
        } else {
            head = p2;
        }

        return head;
    }
}
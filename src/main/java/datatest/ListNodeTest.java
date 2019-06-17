package datatest;


public class ListNodeTest {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }



    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = null;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        int result = swapPairs(listNode1,2,4).val;
        System.out.println(result);
    }


    public static ListNode swapPairs(ListNode head, int v1, int v2) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node1Prev = null,node2Prev = null;
        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.val == v1) {
                node1Prev = cur;
            } else if (cur.next.val == v2) {
                node2Prev = cur;
            }
            cur = cur.next;
        }
        if (node1Prev == null || node2Prev == null)
            return head;
        if (node2Prev.next == node1Prev){
            ListNode t = node1Prev;
            node1Prev = node2Prev;
            node2Prev = t;
        }
        ListNode node1 = node1Prev.next;
        ListNode node2 = node2Prev.next;
        if (node1Prev.next == node1Prev) {
            node1Prev.next = node2;
            node1.next = node2.next;
            node2.next = node1;
        }else {
            node1Prev.next = node1.next;
            node2Prev.next = node2.next;
            node2.next = node1Prev.next;
            node1Prev.next = node2;
            node1.next = node2Prev.next;
            node2Prev.next = node1;
        }
        return dummy.next;
    }

}

package xyz.hardikprajapati.leetcode;

public class AddTwoNumbers {

    public static void main(String[] args) {
//        int[] n1 = {2, 4, 3};
//        int[] n2 = {5, 6, 4};

        int[] n1 = {9,9,9,9,9,9,9};
        int[] n2 = {9,9,9,9};
        ListNode l1 = populate(n1);
        ListNode l2 = populate(n2);
        System.out.println(l1);
        System.out.println(l2);
        ListNode sum = addTwoNumbers(l1, l2);
        System.out.println(sum);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, val1 = 0, val2 = 0, sumOfVal = 0;
        ListNode sumListNode = new ListNode(carry);
        ListNode resultList = sumListNode;
        while (l1 != null || l2 != null || carry != 0) {
            val1 = l1 == null ? 0:l1.val;
            val2 = l2 == null ? 0:l2.val;
            sumOfVal = val1 + val2 + carry;
            resultList.next = new ListNode(sumOfVal%10);
            carry = sumOfVal/10;
            resultList = resultList.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return sumListNode.next;
    }

    public static ListNode populate(int[] n) {
        ListNode temp = new ListNode(n[0]);
        ListNode temp1 = null;
        for(int i = 1; i < n.length; i++) {
            if(temp1 == null) {
                temp.next = new ListNode(n[i]);
                temp1 = temp.next;
            } else {
                temp1.next = new ListNode(n[i]);
                temp1 = temp1.next;
            }
        }
        return temp;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}

    @Override
    public String toString() {
        String temp = "[" + val;
        ListNode next = this.next;
        while (next != null) {
            temp += ", " + next.val;
            next = next.next;
        }
        temp += "]";
        return temp;
    }
}
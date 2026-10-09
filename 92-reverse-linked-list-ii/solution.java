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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode l= head;
        for(int i=1; i<left; i++){
            l = l.next;
        }
        ListNode r= head;
        for(int i=1; i<right; i++){
            r = r.next;
        }
        while(left!=right){
            int temp = l.val;
            l.val = r.val;
            r.val=temp;
            l=l.next;
            left++;
            right--;
            r=fun(right,head);
        }
        return head;   
    }
    public ListNode fun(int n,ListNode head){
        ListNode node = head;
         for(int i=1; i<n; i++){
            node = node.next;
        }
        return node;

    }
}
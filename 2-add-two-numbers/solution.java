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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum1 =0;
        int sum2=0;
        while(l1!=null){
            sum1=sum1*10+l1.val;
            l1=l1.next;
        }
        while(l2!=null){
            sum2=sum2*10+l2.val;
            l2=l2.next;
        }
        int num1=0;
        while(sum1!=0){
            num1 = num1*10 + sum1%10;
            sum1=sum1/10;

        }
        int num2=0
        while(sum2!=0){
            num2 = num2*10 + sum2%10;
            sum2=sum2/10;

        }
        int num= num1+num2;
        
        ListNode head = null;
        ListNode tail = null;
        if (num == 0) {
         return new ListNode(0);
      }

        while (num != 0) {
        int digit = num % 10;

         ListNode newNode = new ListNode(digit);

        if (head == null) {
         head = newNode;
         tail = newNode;
         } else {
        tail.next = newNode;
        tail = newNode;
         }

        num = num / 10;
     }
     return head;
        
        
    }
}
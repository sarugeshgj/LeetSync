/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fastp = head;
        ListNode slowp = head;
        while(fastp != null && fastp.next != null){
            fastp = fastp.next.next;
            slowp = slowp.next;
            if(fastp ==  slowp){
                return true;
            }
        }
        return false;   
    }
}
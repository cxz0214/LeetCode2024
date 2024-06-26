package com.mlc.add_two_numbers_02;
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
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(-1);
		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode current = dummyHead;
		int carry = 0;
		while(p1 != null || p2 != null || carry != 0){
			int x = (p1 != null)? p1.val : 0;
			int y = (p2 != null)? p2.val : 0;
			
			int sum = x + y + carry;
			carry = sum / 10;
			current.next = new ListNode(sum % 10);
			current = current.next;
			
			if(p1 != null) p1 = p1.next;
			if(p2 != null) p2 = p2.next;
		}
		return dummyHead.next;
	}
}
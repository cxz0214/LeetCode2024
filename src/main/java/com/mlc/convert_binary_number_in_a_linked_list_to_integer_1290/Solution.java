package com.mlc.convert_binary_number_in_a_linked_list_to_integer_1290;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Solution {
	public int getDecimalValue(ListNode head) {
		int r = 0;
		for(; head != null; head = head.next){
			r = (r << 1) | head.val;
		}
		return r;
	}
}

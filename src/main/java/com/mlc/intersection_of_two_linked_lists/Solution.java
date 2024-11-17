package com.mlc.intersection_of_two_linked_lists;

import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<ListNode> set = new HashSet<>();
		
		ListNode tmpA = headA;
		ListNode tmpB = headB;
		
		while(tmpA != null){
			set.add(tmpA);
			tmpA = tmpA.next;
		}
		
		while(tmpB != null){
			if(set.contains(tmpB)){
				return tmpB;
			}
			tmpB = tmpB.next;
		}
		
		return null;
	}
}

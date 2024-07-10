package com.mlc.merge_two_sorted_lists_21;


/**
 *Definition for singly-linked list.
 */
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
public class Solution {
	// 常规解法
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode p1 = list1;
		ListNode p2 = list2;
		
		ListNode dummyHead = new ListNode(-1);
		ListNode curNode = dummyHead;
		
		while(p1 != null && p2 != null){
			int x = p1.val;
			int y = p2.val;
			int minValue = x;
			if(x <= y){
				p1 = p1.next;
			}else{
				minValue = y;
				p2 = p2.next;
			}
			
			curNode.next = new ListNode(minValue);
			curNode = curNode.next;
		}
		
		curNode.next = p1 == null ? p2 : p1;
		return dummyHead.next;
	}
	
	// 递归解法
	public ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2){
		if(list1 == null) return list2;
		if(list2 == null) return list1;
		
		if(list1.val <= list2.val){
			ListNode cur = new ListNode(list1.val);
			cur.next = mergeTwoLists(list1.next,list2);
			return cur;
		}else{
			ListNode cur = new ListNode(list2.val);
			cur.next = mergeTwoLists(list1,list2.next);
			return cur;
		}
	}
}

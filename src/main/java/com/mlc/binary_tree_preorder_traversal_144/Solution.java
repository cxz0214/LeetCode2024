package com.mlc.binary_tree_preorder_traversal_144;

import java.util.*;

/**
 * 题目：https://leetcode.cn/problems/binary-tree-preorder-traversal/description/
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    // 非递归解法，这里的stack不能使用Deque
    public List<Integer> preorderTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        
        for (stack.push(root); !stack.isEmpty();){
            root = stack.pop();
            if(root != null){
                ans.add(root.val);
                stack.push(root.right);
                stack.push(root.left);
            }
        }
        return ans;
    }
/**
 * 递归实现
 *
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        dfs(root,ans);
        return ans;
    }
    
    private void dfs(TreeNode root,List<Integer> ans){
        if(root == null){
            return;
        }
        ans.add(root.val);
        dfs(root.left,ans);
        dfs(root.right,ans);
    }
 */
}

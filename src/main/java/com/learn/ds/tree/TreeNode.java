package com.learn.ds.tree;

public class TreeNode {
	
	private Integer value;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int value) {
		
		this.value=value;
		this.left=null;
		this.right=null;
	}
	
	
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	
	
	

}

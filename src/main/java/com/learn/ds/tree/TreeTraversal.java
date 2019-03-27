package com.learn.ds.tree;

public class TreeTraversal {
	
	public static void inorder(TreeNode node) {
		if(node==null) {
			System.out.println("Invalid Tree");
			return ;
		}
		if(node.getLeft()!=null) {
			inorder(node.getLeft());
		}
		System.out.print(node.getValue()+" ");
		if(node.getRight()!=null) {
			inorder(node.getRight());
		}
	}
	
	public static void preorder(TreeNode node) {
		
		
		if(node==null) {
			System.out.println("Invalid Tree");
			return ;
		}
		System.out.print(node.getValue()+" ");
		
		if(node.getLeft()!=null) {
			inorder(node.getLeft());
		}
		
		if(node.getRight()!=null) {
			inorder(node.getRight());
		}
	}
	
public static void postorder(TreeNode node) {
		
		
		if(node==null) {
			System.out.println("Invalid Tree");
			return ;
		}	
		if(node.getLeft()!=null) {
			inorder(node.getLeft());
		}
		
		if(node.getRight()!=null) {
			inorder(node.getRight());
		}
		System.out.print(node.getValue()+" ");
}
	
	

}

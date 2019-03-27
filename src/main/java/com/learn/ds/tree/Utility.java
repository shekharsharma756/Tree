package com.learn.ds.tree;

import java.util.logging.Logger;

public class Utility {
	
	public static Logger logger = Logger.getLogger(Utility.class.getName());
	
	private static String treeToString(TreeNode node, String pos) {
		
		String res = pos+node.getValue();	

	   	if(node.getLeft()!=null){

	   		res+=treeToString(node.getLeft(),pos+"L");

	   	}
	   	if(node.getRight()!=null){

	   		res+=treeToString(node.getRight(),pos+"R");

	   	}

	   	return res;
		
	}
	
	public static String generateStringFromTree(TreeNode node) {
		
		
		if(node!=null) {
			return treeToString(node,"");
		}
		else {
			logger.info("Invalid tree");
			return "";
		}
		
		
	}
	
	
	public static String FetchPosition(String s){
		String pos="";
		for(int i=0;i<s.length();i++){
		if(!Character.isDigit((Character)s.charAt(i))){
		pos=pos+s.charAt(i);
		}
		else return pos;
		}
		return pos;
	}
	
	
	
	public static String FetchValue(String s){
		
		String val ="";
		for(int i=0;i<s.length();i++){
		if(Character.isDigit(s.charAt(i)))
		val=val+s.charAt(i);
		else return val;
		}
		return val;

	}
	
	
	public static TreeNode insert(TreeNode root, String position,Integer val){
		
		TreeNode cur = root;
		 
		while(position.length()!=1){

		if(position.charAt(0)=='R'){
			if(cur.getRight()!=null)
			cur=cur.getRight();
			else {
				logger.info("Invalid String, Can not generate tree");
				return null;
			}
		}
		else if(position.charAt(0)=='L'){
			if(cur.getLeft()!=null)
				cur=cur.getLeft();
				else {
					logger.info("Invalid String, Can not generate tree");
					return null;
				}
		}
		else {
			logger.info("Invalid String, Can not generate tree");
			return null;
		}
		position=position.substring(1);
		}
		
		TreeNode node = new TreeNode(val);
		if(position.charAt(0)=='R') {
			if(cur.getRight()==null) {
				cur.setRight(node);
			}
			else {
				logger.info("Invalid String, can not generate tree");
				return null;
			}
		}
		else if(position.charAt(0)=='L') {
			if(cur.getLeft()==null) {
				cur.setLeft(node);
			}
			else {
				logger.info("Invalid String, can not generate tree");
				return null;
			}
		}
		else {
			logger.info("Invalid String, can not generate tree");
			return null;
		}
		
		return root;



	}


}

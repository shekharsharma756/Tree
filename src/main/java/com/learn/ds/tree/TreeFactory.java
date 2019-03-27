package com.learn.ds.tree;

import java.util.logging.Logger;

public class TreeFactory {

private static Logger logger = Logger.getLogger(TreeFactory.class.getName());


public static TreeNode GenerateTreeFromString(String s) {
	
	String position=Utility.FetchPosition(s);
	if(!position.equals("")){
	logger.warning("Invalid String, Tree Can not be generated");
	return null;
	}
	String val = Utility.FetchValue(s);
	if(val.equals("")) {
		logger.warning("Invalid String, Tree can not be generated");
		return null;
	}
	try {
	TreeNode node = new TreeNode(Integer.parseInt(val));
	s=s.substring(val.length());
	while(s.length()>0){

		position=Utility.FetchPosition(s);
		if(position.equals("")){
		logger.info("Invalid String, Tree can not be generated");
		return null;
		}
		logger.info("Position to insert "+position);
		s=s.substring(position.length());
		val = Utility.FetchValue(s);
		if(val.equals("")) {
			logger.warning("Invalid String, Tree Can not be generated");
			return null;
		}
		logger.info("Value to insert is "+val);
		s=s.substring(val.length());
		node=Utility.insert(node,position,Integer.parseInt(val));
		if(node==null) {
			return null;
		}

	}
	return node;
	
	}
	catch(Exception ex) {
		logger.info(ex.toString());
		return null;
	}
	

	}
	
	
}







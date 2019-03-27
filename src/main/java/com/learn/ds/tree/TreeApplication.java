package com.learn.ds.tree;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TreeApplication {

	public static Logger logger = Logger.getLogger(TreeApplication.class.getName());
	public static void main(String[] args) {
		
		TreeNode node = TreeFactory.GenerateTreeFromString("1L2LL4LR5R3");
		if(node!=null) {
			logger.info("Tree Generated Succesfully");
			TreeTraversal.inorder(node);
			logger.info("Tree to String "+Utility.generateStringFromTree(node));
		}
		else {
			logger.warning("Tree Generation Failed");
		}
		
	}

}

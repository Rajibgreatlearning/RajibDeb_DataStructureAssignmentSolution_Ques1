package com.gl.bst.beans;

public class TraverseTree {

	public void convertToRightSkewed(Node root) {
		
		if(root==null) {
			return;
		}
		else {
			convertToRightSkewed(root.left);
			
			System.out.print(root.key);
			System.out.print(" ");
			
			convertToRightSkewed(root.right);
		}

	}


}

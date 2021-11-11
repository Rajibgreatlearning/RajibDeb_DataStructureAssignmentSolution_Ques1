package com.gl.bst.main;



import com.gl.bst.beans.Insert;
import com.gl.bst.beans.Node;
import com.gl.bst.beans.TraverseTree;


public class Driver {
	public static Node root;

	public static void main(String[] args) {
		Insert in = new Insert();
		
		TraverseTree traverse = new TraverseTree();
		int[] arr = { 50,30,60,10,40};  //Taking the input 

		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];
			if (root == null) {
				root = in.insertTree(root, value);
			} else {
				in.insertTree(root, value);
			}
		} // for

		

		System.out.println("Convert the BST to skewed tree");
		traverse.convertToRightSkewed(root);
		
		
	}

}

package com.gl.bst.beans;

public class Insert {

	public Node newNode(int key) {
		Node temp = new Node();
		temp.key = key;
		temp.left = null;
		temp.right = null;
		return temp;

	}
	
	public Node insertTree(Node root,int key) {
		Node newNode=newNode(key);
		Node x=root;
		Node parent_Node =null;
		while(x!=null) {
			parent_Node=x;
			if(key<x.key) {
				x=x.left;
			}else if(key>x.key) {
				x=x.right;
			}
			else
			{
				System.out.println("The value already exist");
				return newNode;
			}
			
		}//while
		
		if(parent_Node==null) {
			parent_Node=newNode;
		}
		else if(key<parent_Node.key){
			parent_Node.left=newNode;
		}
		else {
			parent_Node.right=newNode;
		}
		
		return parent_Node;
		
	}

}

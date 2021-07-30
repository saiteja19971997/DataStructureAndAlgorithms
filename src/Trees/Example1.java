//package Trees;
//
////Iterative Queue based Java program 
////to do level order traversal
////of Binary Tree
//
///* importing the inbuilt java classes 
//required for the program */
//import java.util.Queue;
//import java.util.LinkedList;
//
///* Class to represent Tree node */
//class Node {
//	int data;
//	Node left, right;
//
//	public Node(int item) {
//		data = item;
//		left = null;
//		right = null;
//	}
//}
//class Test2 { }
//
//class Example1 {
//
//	Node root;
//	void printLevelOrder() 
//	{
//		Queue<Node> queue = new LinkedList<Node>();
//		queue.add(root);
//		while (!queue.isEmpty()) 
//		{
//			Node tempNode = queue.poll();
//			System.out.print(tempNode.data + " ");
//
//			if (tempNode.left != null) {
//				queue.add(tempNode.left);
//			}
//
//			if (tempNode.right != null) {
//				queue.add(tempNode.right);
//			}
//		}
//	}
//
//	public static void main(String args[]) 
//	{
//		Test2 [][] obj = new Test2[3][];
//        System.out.println(obj[2][0].toString());
//		Example1 tree_level = new Example1();
//		tree_level.root = new Node(1);
//		tree_level.root.left = new Node(2);
//		tree_level.root.right = new Node(3);
//		tree_level.root.left.left = new Node(4);
//		tree_level.root.left.right = new Node(5);
//
//		System.out.println("Level order traversal of binary tree is - ");
//		tree_level.printLevelOrder();
//	}
//}

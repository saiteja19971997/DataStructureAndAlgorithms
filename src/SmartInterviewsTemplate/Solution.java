package SmartInterviewsTemplate;

import java.util.Scanner;

class Node {
	int data;
	Node left, right;

	public Node (int item) {
		data = item;
		left = right = null;
	}
}

public class Solution {
    
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			int len = sc.nextInt();
			int q = sc.nextInt();
			Node root = null;
			for (int j = 0; j < len; j++) {
				int ele = sc.nextInt();
				root = constructBst(root, ele);
			}
			// System.out.println(root.data+" "+root.left.data+" "+root.right.data);
			for (int k = 0; k < q; k++) {
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				Node res = LCA(root, n1, n2);
				System.out.println(res.data);
			}
		}

	}

	public static Node LCA(Node root, int n1, int n2) {
		if(root==null) return null;
		if(root.data == n1 || root.data ==n2) return root;
		
		Node left = LCA(root.left,n1,n2);
		Node right = LCA(root.right,n1,n2);
		
		if(left!=null || right!=null) return root;
		return (left!=null)?left:right;
	}

	public static Node constructBst(Node root, int ele) {
		if (root == null) {
			Node newNode = new Node(ele);
			return newNode;
		}
		if (root.data > ele) {
			root.left = constructBst(root.left, ele);
		} else {
			root.right = constructBst(root.right, ele);
		}
		return root;
	}
}
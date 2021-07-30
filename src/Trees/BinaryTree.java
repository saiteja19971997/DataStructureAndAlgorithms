package Trees;

//Recursive optimized Java program to find the diameter of
//a Binary Tree

//Class containing left and right child of current
//node and key value
class Node {
	int data;
	Node left, right;

	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}

//Class to print the Diameter

class BinaryTree {
	Node root;
    int res;
	int diameter(Node root, int res)
	{
		if (root == null)
			return -1;
		int l=1+diameter(root.left,this.res);
		int r=1+diameter(root.right,this.res);
		int d = l+r+1;
		System.out.println("d: "+d);
		if(d>this.res)
		{
			this.res=d;  
		}
		return (Math.max(l,r));
	}

	void diameteru() { 
		 diameter(root,res); 
		 
		} 
	public static void main(String args[])
	{
		// creating a binary tree and entering the nodes
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.left.left = new Node(10);
		tree.root.left.right.right = new Node(5);
		tree.root.left.right.right.right = new Node(5);
		//int res=0;
		// Function Call
		tree.diameteru();
		System.out.println("The diameter of given binary tree is : "+" "+tree.res);
	}
}

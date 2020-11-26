
public class TestingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapesImpl square = new ShapesImpl(4, 5);
		
		System.out.println("Area of the square is: " + square.calculateArea());
		/*
		int[] test1 = new int[] {1,-4,-5,8,2,6};
		int[] test2= new int[] {-1};
		int[] test3= new int[] {1,1};
		int[] test4= new int[] {9,-3,1};
		SortingAlgorithms saObj = new SortingAlgorithms();
		saObj.quickSort(test1);
		saObj.quickSort(test2);
		saObj.quickSort(test3);
		saObj.quickSort(test4);
		*/
		
		TreeNode left = new TreeNode(1);
		TreeNode right = new TreeNode(3);
		TreeNode node = new TreeNode(2,left,right);
		System.out.println("TreeNode node: " + node.toString());
		BinarySearchTree BST = new BinarySearchTree();
		System.out.println("Is valid BST: " + BST.isValidBST(node));
	}

}

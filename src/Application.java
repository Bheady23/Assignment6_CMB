
/**
 * This is the application class for the classes Node, Tree and DepthFirstSearch.
 * It creates a Binary Tree, instantiates it with values, then completes a DepthFirstSearch
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DepthFirstSearch aSearch=new DepthFirstSearch();
		aSearch.DFS(root);
		System.out.println();
		System.out.println("The number of nodes Traversed = "+DepthFirstSearch.traversed);
		System.out.println("The Height of the tree equals = "+(Math.pow(2, 5)-1));
	}//end main

}//end class
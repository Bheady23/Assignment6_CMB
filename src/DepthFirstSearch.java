/**
 * This class uses the DFS() to complete a Depth First search on a Binary Tree
 * Printing the data of each node it visits to the screen.  
 * @author Nathan Johnson and Chris Burkhead, Bellarmine University
 * CS215-ON
 * Fall 2022
 * Assignment 6
 *
 */

public class DepthFirstSearch {   
		//instance variables
       Node root;
       static int traversed=0; //keeps track of how many nodes have been traversed during the search
       
       /**
        * Preferred constructor
        */
       public DepthFirstSearch()
       {            
    	   	System.out.println("Call DFS with root node to do a Depth First Search.");
       }//end preferred constructor
       
       
       /**
        * DFS() uses recursion to execute a DepthFirst search 
        * On a binary tree. Using an If statement it checks to see if both lChild node or rChild are leafs 
        * if one is a leaf it stores that nodes value and calls the method again starting at that value. 
        * It then prints the current node's data to the screen before executing the If statement again.
        * The recursion will continue to execute until all nodes have been visited and their data printed to the screen.
        * @param node
        */
        public void DFS(Node node)  
        {
                  //prints the current node's data for each recursion starting with the root
        		   System.out.println(node.getData()); 
        		   traversed++;
        		 
                   //if statement checks to see if either child node is a leaf
                   if ((node.lChild != null)||(node.rChild !=null))
                   {
                	  traversed++;
                	  DFS(node.getlChild());
                	  DFS(node.getrChild());
                   }//end if 

        }//end DFS
        
}//end Class

package coe318.lab7;
/**
 * Node class; has one integer "num" to define which node it is and a static variable to determine the node number
 */
public class Node {

	private int num;
	private static int statNum;
	/**
	 * Constructor of node variable which takes no parameters
	 */
	public Node(){
		num = statNum;
		statNum++;
	}
	/**
	 * returns an object of string to describe the node based on which node it is
	 */
	public String toString(){
		 return "" + num;
	}
	
	
	
}

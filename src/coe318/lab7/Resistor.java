package coe318.lab7;
/*
 * Resistor class; has a variable for resistance in ohms, as well as to adjacent nodes
 * Also is numbered using a static variable so each resistor can be identified individually
 */
public class Resistor {

	private double resistance;
	private Node left;
	private Node right;
	private int num;
	private static int statNum = 1;
	
	/**
	 * Constructor for a resistor
	 * This throws an error if an entered node is null, or if the resistance is 0 or negative
	 * @param resistance variable for resistor resistance
	 * @param node1 node which resistor is connected to
	 * @param node2 2nd node which resistor is connected to
	 */
	public Resistor(double resistance, Node node1, Node node2){
		
		if(node1 == null || node2 == null){
			throw new IllegalArgumentException("Entered Node is null");
		}
		else{
		if(resistance<=0){
			throw new IllegalArgumentException("Resistance cannot be 0 or negative");
		}
		else{
		num = statNum;
		this.resistance = resistance;
		left = node1;
		right = node2;
		statNum++;
		}
		}
	}
	/**
	 * getNodes method returns the 2 nodes the resistor is connected to in an array of 2 nodes
	 * @return returns array of nodes
	 */
	public Node[] getNodes(){
		Node [] N = new Node[2];
		N[0] =left;
		N[1] = right;
		return N;
	}
	/**
	 * Returns a string describing the resistor
	 * @return returns string including which resistor, adjacent nodes, and resistance
	 */
	public String toString(){
		
		return "R" + num + " " + left + " " + right + " " + resistance;
				
		
	}
	
	
	
	
}

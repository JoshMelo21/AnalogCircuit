package coe318.lab7;
/**
 * Source class defined by some voltage (positive or negative) as well as 2 connected nodes and its own number to identify it
 */
public class Source {
private double voltage;
private Node pos;
private Node neg;
private int num;
private static int statNum =1;
	/**
	 * Source constructor
	 * Throws exception if an entered node is null or if voltage is 0
	 * will otherwise assign values based on the passed parameters
	 * @param voltage variable for source voltage
	 * @param node1 node which is connected to the positive end of the source
	 * @param node2 node which is connected to the negative end of the source
	 */
public Source(double voltage, Node node1, Node node2){
		
		if(node1 == null || node2 == null){
			throw new IllegalArgumentException("Entered Node is null");
		}
		else if(voltage ==0){
			throw new IllegalArgumentException("Voltage entered for source cannot be 0.");
		}
		else{
		num = statNum;
		this.voltage = voltage;
		pos = node1;
		neg = node2;
		statNum++;
		}
		}
	
	/**
	 * getNodes returns an array of the 2 nodes which the source is connected to
	 * @return returns array of nodes containing the connected nodes to the source positive, negative
	 */
public Node[] getNodes(){
	Node [] N = new Node[2];
	N[0] =pos;
	N[1] = neg;
	return N;
}
	/**
	 *toString method returns a string describing the object
	 *@return containing number of the source, the connected nodes, and the voltage value in DC volts
	 */
public String toString(){
	
	return "V" + num + " " + pos + " " + neg + " DC " + voltage;
			
	
}
	
	

}
package coe318.lab7;
import java.util.*;
/*
 * Main class for the user to input circuit information and create a circuit
 */
public class UserMain {

	/**
	 * main method
	 * @param args array of strings
	 */
	public static void main(String args []){
		Circuit cir = Circuit.getInstance();
	Scanner input = new Scanner(System.in);
	String type = "";
	int node1= 0;
	int node2 = 0;
	Node n1 = null;
	Node n2 = null;
    double value = 0;
	Node [] n = new Node[100];
	do{
		System.out.println("Enter spice, end, or a component with format: v/r Node1 Node2 voltage/resistance : ");
		type = input.next();
		if(!(type.equals("end")||type.equals("spice")||type.equals("v")||type.equals("r"))){
			throw new IllegalArgumentException("You must enter 'v', 'r', 'end' or 'spice'");
		}
		
		if(!((type.equals("end"))||(type.equals("spice")))){
		node1 = input.nextInt();
		node2 = input.nextInt();
		value = input.nextDouble();
		}
		
		if(node1 < node2){
		if(n[node1]==null ){
          n1 = new Node();
         n[node1] = n1;
		}
		
		if(n[node2] == null){
	    n2 = new Node();
		n[node2] = n2 ;
		}
		}
		
		if(node2<node1){
			if(n[node2] == null){
			    n2 = new Node();
				n[node2] = n2 ;
				}
			if(n[node1]==null ){
		          n1 = new Node();
		         n[node1] = n1;
				}
		}
		
		if(type.equals("v")){
		Source v = new Source(value, n[node1], n[node2]);
			cir.addV(v);
		}
		if(type.equals("r")){
			Resistor r = new Resistor(value, n[node1], n[node2]);
			cir.add(r);
			
		}
		if(type.equals("spice")){
			cir.spice();
		}
		
	}while(!(type.equals("end")));
		
		System.out.println("All Done!");
	}
}
	
	
	


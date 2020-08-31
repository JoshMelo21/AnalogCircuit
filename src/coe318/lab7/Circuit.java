package coe318.lab7;
import java.util.*;
/**
 * Circuit Object is a singleton, uses array lists of resistors and sources to create the circuit
 */
public class Circuit {

	private static Circuit instance = null;
	private ArrayList<Resistor> a = new ArrayList<Resistor>();
	private ArrayList<Source> b = new ArrayList<Source>();
	private ArrayList<String> c = new ArrayList<String>();
	
	/**
	 * Method to create singleton circuit, creates new instance if one is not already instantiated
	 * @return returns the current instance of the Circuit
	 */
	public static Circuit getInstance(){
		if(instance == null){
			instance = new Circuit();
		}
		return instance;
	
	}
	/**
	 * Circuit constructor which takes no parameters
	 */
    private Circuit(){}
	/**
	 * add method adds a resistor object 'r' to the ArrayList of resistors
	 * will throw an exception if passed object is null
	 * @param r object of type Resistor
	 */
    public void add(Resistor r){
    	if(r == null){
    		throw new IllegalArgumentException("Given Resistor is null.");
    	}
    	else{
    	a.add(r);
    	c.add("r");
    }
    }
    	/**
    	 * addV object adds a source object 'v' to the ArrayList of sources
    	 * will throw an exception is passed object is null
    	 * @param v Object of type Source
    	 */
    	 public void addV(Source v){
    	    	if(v == null){
    	    		throw new IllegalArgumentException("Given Source is null.");
    	    	}
    	    	else{
    	    	b.add(v);
    	    	c.add("v");
    	    }
    	
    }
    	 /**
    	  * spice method prints out the array list of resistors and sources in the order they were entered
    	  */
    	 public void spice(){
    int i = 0;
    int v = 0;
    int r = 0;
    		 while(i<c.size()){
    			 try{
    			 if(c.get(i).equals("r") && r<a.size()){
    				 System.out.println(a.get(r).toString());
    				 r++;
    				 i++;
    			 }
    			 
                    if(c.get(i).equals("v") && v<b.size()){
                    	System.out.println(b.get(v).toString());
       				 v++;
       				 i++;
    			 }
    			 }
    			 catch(Exception e){
    				 
    			 }
    			 
    			 
    		 }
    		 
    		 
    	 }
	/**
	 * toString method returns a string describing the circuit
	 * uses the toString method of resistor and source objects to make the final string
	 * @return returns all the voltage sources and resistors in the circuit
	 */
    public String toString(){
    	String s = "";
    	for(int i =0; i<a.size(); i++){
    		if(i==0){
    			s = a.get(0).toString();
    		}
    		else{
    		s = s + "\n"+ a.get(i).toString();
    		}
    		
    	}
    	
    	for(int i =0; i<b.size(); i++){
    		if(i==0){
    			s = s + "\n" + b.get(0).toString();
    		}
    		else{
    		s = s + "\n" + b.get(i).toString();
    		}
    		
    	}
    	return s;
    }
    	
    }
    
    


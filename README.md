# AnalogCircuit

This project was compiled in the netbeans enviornment, however all the relevant source code can be found in /src/coe318/lab7

Uses singleton pattern to create a single circuit at a time.

To run the project, use the file UserMain.java

This application generates basic circuits input by the user, using basic resistors, voltage sources and nodes.


To enter information do it in the format: v/r Node1 Node2 voltage value/resistance value

For example, if you wanted to add a voltage source with a value of 10 volts connected to nodes 1 and 2 of a circuit this is what you would enter:

v 1 2 10

you can alo simply enter "end" to terminate the program

tying the command "spice" prints out the current elements of the circuit in the order they were entered

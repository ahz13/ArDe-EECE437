
public class TAPlus extends TANumericFunction {

	void printState()
	{
		operation.printState();
	}
	

	String type()
	{
		return operation.type();
		
	}
	
	
	void evaluate()
		 {
			operation.evaluate();
		 }
		 
	void operands()
	{
		operation.operands();
	}
	
	
	
	

	
	protected TAPlus()
	{
		opvalue = "+";
	}
	
	
	
	
	
	//two arguemnts
	 <E extends TAIntValue> TAPlus(E a, E b)
	{
		operation = new TAPlusInt(a,b);
	}
	 
	 <E extends TADoubleValue> TAPlus (E a, E b)
	 {
		 operation = new TAPlusDouble(a,b);
	 }
	 
	 
	 
	 
	 //two arguments and a name
	 <E extends TAIntValue> TAPlus(E a, E b, String s)
	 {
		 operation = new TAPlusInt(a,b,s);
	}
	
	 <E extends TADoubleValue> TAPlus (E a, E b, String s)
	 {
		 operation = new TAPlusDouble(a,b,s);
	}
	 
	 
	 
	
	private TAPlus operation;
	


	
	
}
	

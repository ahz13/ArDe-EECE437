public class TADivideInt<T extends TAIntValue> extends TADivide implements TAIntValue {

	 public void evaluate()
	 {op1.evaluate();
	 op2.evaluate();
	value = op1.value()/op2.value();}
	 
	 
	public void list()
	{
		if (name!= null)
			System.out.println(name);
		else
		{
			System.out.print("(/ ");
			op1.list();
			System.out.print(" ");
			op2.list();
			System.out.print(")");
			}
				
	}
	
	void printState()
	{
		System.out.print(value);
	}
	
	
	String type()
	{
		return "int";
	}
	
	
	 
	public int value()
	{return value;}
	

	
	
	
	
	

	
	 TADivideInt(T a, T b)
	{
		op1 = a;
		op2 = b;
		
	}
	 
	 TADivideInt (T a, T b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	
	 
	
	 
	 
	T op1, op2;
	int value;
	
	
	
	
}
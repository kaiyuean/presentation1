public class MethodOverride
{
	public void eat()
	{
		System.out.println("superclass");
	}
}
public class Subclass extends MethodOverride
{
	public void eat()
	{
	    	System.out.println("subclass");
	}
	public static void main( String args[]) 
	{
		Subclass obj = new Subclass();
	    	obj.eat();
	}
}
public class MethodOverload 
{
	public void disp(char c)
	{
	    System.out.println(c);
	}
	public void disp(char c, int num)  
	{
	    System.out.println(c + " "+num);
	}
	public static void main(String args[])
	{
	    MethodOverload obj = new MethodOverload();
	    obj.disp('a');
	    obj.disp('a',10);
	}
}

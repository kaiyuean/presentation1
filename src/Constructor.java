public class Constructor
{
public Constructor()
    {
	System.out.println("This is a default constructor");
	}
public Constructor(int num)
    {
	System.out.println("This is a parameterized constructor");
    }
public static void main(String args[])
    {
	Constructor obj1 = new Constructor();
	Constructor obj2 = new Constructor(2);
    }
}

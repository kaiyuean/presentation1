public class Inheritance
{
	int age;

	Superclass(int age)
	{
		this.age=age; 		 
	}
	public void getAge()
	{
		System.out.println("The value of the variable named age in super class is: " +age);
	}
}
public class Subclass extends Inheritance 
{
	Subclass(int age)
	{
		super(age);
	}
	public static void main(String args[])
	{
		Subclass s= new Subclass(24);
		s.getAge();
	}
}

public class Super
{
    public void printMethod() 
    {
        System.out.println("Printed in Superclass.");
    }
}
public class Subclass extends Super 
{
    // overrides printMethod in Superclass
    public void printMethod() 
    {
        super.printMethod();
        System.out.println("Printed in Subclass");
    }
    public static void main(String[] args) 
    {
        Subclass s = new Subclass();
        s.printMethod();    
    }
}
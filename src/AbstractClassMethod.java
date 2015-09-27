abstract public class AbstractClassMethod
{
   public void oneMethod()
   {
       System.out.println("Hello");
   }
   abstract public void anotherMethod();
}
public class Concrete extend AbstractClassMethod
{
   public void anotherMethod()
   { 
       System.out.print("Abstract method"); 
   }
   public static void main(String args[])
   { 
      Concrete obj = new Concrete();
      obj.anotherMethod();
   }
}
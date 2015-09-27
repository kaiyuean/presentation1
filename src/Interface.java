interface Interface
{
   public void method1();
   public void method2();
}
class XYZ implements Interface
{
  public void method1()
  {
      System.out.println("implementation of method1");
  }
  public void method2()
  {
      System.out.println("implementation of method2");
  }
  public static void main(String arg[])
  {
      Interface obj = new XYZ();
      obj. method1();
  }
}
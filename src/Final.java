class Final
{  
   //Blank final variable
   final int MAX_VALUE;
	 
   Final()
   {
      //It must be initialized in constructor
      MAX_VALUE=100;
   }
   void myMethod()
   {  
      System.out.println(MAX_VALUE);
   }  
   public static void main(String args[])
   {  
      Final obj=new Final();  
      obj.myMethod();  
   }  
}
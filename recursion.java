public class recursion
{
   public static void main(String ss[])
   {
      func();
   }
   
   public static void func()
   {
      System.out.println("1");
	  
	  func();
   }
   
}
public class print_name
{
   public static void main(String ss[])
   {
      int n = 5;
	  
	  print(1,n);
   }
   
   
   public static void print(int i , int n)
   {
      //base case
      if(i > n)
	  {
	     return;
	  }
	  
	  System.out.println("SS");
	  
	  
	  print(i+1,n);
   
   }

}
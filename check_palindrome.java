public class check_palindrome
{
   public static void main(String ss[])
   {
      String str = "racecar";
	  int i=0;
	  int j=str.length()-1;
	  
	 boolean ans =  solve(str,i,j);
	 System.out.println(ans);
   }
   
   public static boolean solve(String str,int i,int j)
   {
      
	  if(i >= j)
	  {
		 return true;
	  }
	
	 else if(str.charAt(i) != str.charAt(j))
	  {  
         
		 return false;
	  }
	  
	  return solve(str,i+1,j-1);
   }
}
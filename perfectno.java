public class perfectno
{
   public static void main(String ss[])
   {
      int no = 28;
	  int sum = 0;
	  
	  int i = 1;
	  
	  boolean ans = solve(no,sum,i);
	  System.out.println(ans);
   }
   
   public static boolean solve(int no,int sum,int i)
   {
      if(i > no/2)
       {
	      if(sum == no)
		  {
		     return true;
		  }
		  return false;
	   }

       
       if( no % i == 0)
        {
		  sum = sum + i;
		}	   
		
		i = i + 1;
		
	   return solve(no,sum,i);
   
   
   
   
   }


}
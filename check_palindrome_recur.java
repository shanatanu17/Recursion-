public class check_palindrome_recur
{
   public static void main(String ss[])
   {
      int no = 123321;
	  int cpno = no;
	  int rev = 0;
	  
	  
	  int revno = solve(no,rev);
	  
	  if(no == revno)
	  {
	     System.out.println("Palindrome no");
	  }
	  else
	  {
	     System.out.println("Not palindromic no");
	  }
   }
   
   
   public static int solve(int cpno , int rev)
   {
   
      if(cpno == 0)
	  {
	    return rev;
	  }
	  
	  int ld = cpno % 10;
	  rev = rev * 10 + ld;
	  cpno = cpno / 10;
	  
	  return solve(cpno,rev);
	  
   
   }

}
public class reverse_array
{
   public static void main(String ss[])
   {
      int arr[] = new int[]{10,20,30,40,50,60};
	  
	  int i=0;
	  int j= arr.length-1;
	  
	  solve(arr,i,j);
	  for(int k=0;k<arr.length;k++)
	  {
	     System.out.print(arr[k] +" ");
	  }
   }
   
   public static void solve(int arr[] , int i ,int j)
   {
	   if(i >= j)
	   {
		   return;
	   }
	   
	   int temp = arr[i];
	   arr[i] = arr[j];
       arr[j] = temp;
	   
	   solve(arr,i+1,j-1);
   }

}
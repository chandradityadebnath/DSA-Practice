public class Find_Minimum
{
    public static int findMinimum(int[] arr)
    {
      if(arr==null || arr.length==0)
      {
        throw new IllegalArgumentException("Invalid Choice");
    }
    int min=arr[0];
    
    for(int i=1; i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    
     
    }
    public static void main(String[] args)
    {
        int[] arr={5,9,13,5,1,2};
        System.out.println("Minimum value in our array: "+ findMinimum(arr));
    }
}


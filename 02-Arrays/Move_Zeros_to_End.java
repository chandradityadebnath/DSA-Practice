public class Move_Zeros_to_End {
  public void printArray(int[] arr) 
  {
     System.out.println( "Our Arrays are:" );
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+ ",");
    }
}
public void arrayDemo()
{
    int[] arr={8,1,0,2,1,0,3};
    moveZeros(arr, arr.length);
    printArray(arr);
}
public void moveZeros(int[] arr, int n)
{
    int j=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]!=0 && arr[j]==0)
        {
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
        }
        if (arr[j]!=0)
        {
            j++;
        }
    }
}
public static void main(String args[])
{
    Move_Zeros_to_End demo=new Move_Zeros_to_End();
    demo.arrayDemo();
}
}
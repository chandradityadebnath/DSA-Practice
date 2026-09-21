public class Print_Array 
{
    public static void printArray(int arr[])
    {

    int n=arr.length;
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i] + ", ");
    }
    System.out.println();
}


public static void main (String args[])
{
    int [] arr={12,3,45,33,5,31};
    printArray(arr);
}
}


public class Resize_Array
{
    public void printArray(int arr[])
    {
        int n= arr.length;
        System.out.print("{");
        for (int i=0;i<n;i++)
        {
            
            System.out.print(arr[i] + ",");
            
        }
        System.out.print("}");
        System.out.println();
    }
    public int [] resize (int[] arr, int capacity)
    {
        int[] temp = new int [capacity];
        for (int i=0; i<arr.length; i++)
        {
            temp[i] = arr[i];
        }
        return temp;

    }
    public static void main(String[] args)
    {
        Resize_Array resizeutil = new Resize_Array();
        int[] original = new int[] {5,1,2,9,10};
        System.out.println("The Original Size: " +original.length);
        resizeutil.printArray(original);
        original= resizeutil.resize(original,10);
        System.out.println("The Size of Original Array after addition of new length is " +original.length);
        resizeutil.printArray(original);



    }
}
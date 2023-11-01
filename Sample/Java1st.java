import java.util.*;

class Java1st
{
    public static void main(String[] arg)
    {
        System.out.println("Array Length Of Value");
        Scanner scan = new Scanner(System.in);
        int Length = scan.nextInt();

        
        int[] arr = new int[Length];
        for(int i = 0 ; i<=Length;i++)
        {
            arr[i] = scan.nextInt();
            System.out.println("Array " + i + " Values is" + arr[i]);
        }

        scan.close();


    }
}

import java.util.*;

class Java1st
{
    public static void main(String[] arg)
    {
        System.out.println("Enter The Value");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int Add = num2 + num1;
        System.out.println("Total is " + Add);
    }
}
import java.io.*;
import java.util.*;

class TrytoSwap
{
    public static void main(String[] args)
    {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter First String :");
    String s1 = scn.nextLine();
    System.out.println("Enter Second String :");
    String s2 = scn.nextLine();
    
    s1 = s1 + s2;

    s1 = s1.substring(s1.length()-s2.length());
    s2 = s1.substring(s2.length());

    System.out.println(s1);
    System.out.println(s2);
    }
}

import java.util.*;

class Star {
    public static void main(String arg[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Row");
        int z = scn.nextInt();
        while (true) {
            for (int i = 0; i <= z; i++) 
            {
                for (int j = 0; j <= z; j++) 
                {
                    System.out.print(j);
                }

                for (int j = 0; j <= 10; j++) 
                {
                    System.out.print(j);
                }
                
                System.out.println("");
            }

        }
    }
}
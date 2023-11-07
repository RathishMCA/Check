import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;

class JavaWriter
{
    public static void main(String [] arg)
    {
        try
        {
            FileWriter FWriter = new FileWriter("F:\\Program\\filetxt.txt");
            FWriter.write("Hi Every One This is The First File Java Writing Program");
            System.out.println("File Writing Successfull");
            // Scanner scan = new Scanner((Readable) FWriter);
            // if(scan.hasNextLine())
            // {
            //     String data = scan.nextLine();
            //     System.out.println(data);
            // }
            FWriter.close();
            // scan.close();
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
import java.io.FileWriter;
import java.io.IOException;

class JavaWriter
{
    public static void main(String [] arg)
    {
        try
        {
            FileWriter FWriter = new FileWriter("F:\\Program\\filetxt.txt");
            FWriter.write("Hi Every One This is The First File Java Writing Program");
            FWriter.close();
            System.out.println("File Writing Successfull");
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
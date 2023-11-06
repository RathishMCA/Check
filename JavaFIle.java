import java.io.File;
import java.io.IOException;

class FileJava
{
    public static void main(String arg[])
    {

      try{
         File TxtFile = new File("F:\filetxt.txt");
        if(TxtFile.createNewFile())
        {
            System.out.println("The File Is Created :"+TxtFile.getName());
        }
        else
        {
            System.out.println("The File is Alread Exist");
        }
    }

    catch(IOException e)
    {
        e.printStackTrace();
    }
    }
}
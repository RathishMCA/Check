import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileExistCheck 
{
  public static void main(String[] arg)
  {
    try
    {
    File myFile = new File("MyFile.txt");
    myFile.createNewFile();
        if(myFile.exists())
          {
            System.out.println("The File is Exist");
          }
        else
        {
            System.out.println("The File Not Exist");
        }

        FileWriter myFil = new FileWriter("MyFile.txt");
        myFil.write("Hi Every One What Are You Doing Write Now ?");
        myFil.close();
     }

     catch(IOException e)
     {
        System.out.println("Error Occured");
        e.printStackTrace();
     }
  }   
}


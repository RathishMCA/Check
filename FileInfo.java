import java.io.File;

public class FileInfo 
{
    public static void main(String[] arg)
      {
    
         {
            File Obj = new File("filetxt.txt");
          if(Obj.exists())
             {
                System.out.println("File Name is " + Obj.getName());
                System.out.println("File Bath is " + Obj.getAbsolutePath());
                System.out.println("This File Readable :" +  Obj.canRead());
                System.out.println("This File Writeable : " + Obj.canWrite());
                System.out.println("This File Size is : " + Obj.length());
             }    
         }   

    }
}
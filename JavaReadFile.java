import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaReadFile 
{
    public static void main(String[] arg)throws IOException
    {
        try
        {
            File NewFiles = new File("F:\\Program\\filetxt.txt");
            Scanner scan = new Scanner(NewFiles);
           
           
            FileWriter NewFil = new FileWriter("F:\\Program\\filetxt.txt");
            NewFil.write("Hi Every One Whats The Matter ?");
            NewFil.close();

             while(scan.hasNextLine())
            {
                String Data = scan.nextLine();
                System.out.println(Data);
            }
             scan.close();
        }

        catch(FileNotFoundException e)
        {
            System.out.println("Error is Occured");
            e.printStackTrace();
        }

    }    
}

// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

// class JavaReadFile
// {
//     public static void main(String[] arg)
//     {
//       try{
//          File myFile = new File("MyFile.txt");
//          myFile.createNewFile();
//          FileWriter Fwrite = new FileWriter("MyFile.txt");
//          Fwrite.write("Hi Every One... What Are You Doing Right Now ?");
//         Scanner scan = new Scanner(myFile);
//          while(scan.hasNextLine())
//         {
//             String data = scan.nextLine();
//             System.out.println(data);
//         }
//         scan.close();
//         Fwrite.close();
//     }

//     catch(IOException e)
//     {
//         System.out.println("Error is Occoured ");
//         e.printStackTrace();

//     }
//     }
// }

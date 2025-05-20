//Copying file content to another file.
import java.io.*;
public class io8
{
    public static void main(String[] args) 
    {
        File f=new File("content.txt");
        int ch;
    if(f.exists())
    {
     try(FileInputStream finput=new FileInputStream(f))
     {
        //finput.skip()
        FileOutputStream foutput=new FileOutputStream("C:\\Users\\KIIT\\Desktop\\Display\\Programming\\JAVA\\mypack1.java");
        
        while((ch=finput.read())!=-1)
        {foutput.write((char)ch);}
        foutput.close();
     } 
     catch(IOException ioe){System.out.println(ioe);}

     if(new File("C:\\Users\\KIIT\\Desktop\\Display\\Programming\\JAVA\\mypack1.java").exists())
     System.out.println("File Copied.");
     else
     System.out.println("File Not Copied.");
    }
  }
}

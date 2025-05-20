import java.io.*;
public class io10 {
    public static void main(String[] args) 
    {
        File f=new File("content.txt");
        PrintWriter pw=new PrintWriter(System.out);
        try(FileInputStream fr=new FileInputStream(f))
        {   int ch;     
            fr.skip(17);
            while((ch=fr.read())!=-1)
            {pw.print((char)ch);}
            pw.close();
        }
        catch(IOException ioe)
        {
            System.out.println("Exception :- "+ioe);
        }


    }
    
}

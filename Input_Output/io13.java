
import java.io.*;

public class io13 {
    public static void main(String[] args) {
        String s="",content="";
        try(FileReader fr=new FileReader("abc.txt"))
        {int ch;
            while((ch=fr.read())!=-1 )
            {
                content+=(char)ch;
            }
            int start=content.indexOf("district= ")+10;
            int end=content.indexOf("\n",start);
            s=content.substring(start,end);
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
        System.out.println(s);
    }
}

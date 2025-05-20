//USe of FileReader.

import java.io.*;
public class io2 {
    public static void main(String[] args) {
        
        try{
        FileReader f=new FileReader("C:\\Users\\KIIT\\Desktop\\Display\\Programming\\JAVA\\mypack1.java");
        int ch;
        while((ch=f.read())!=-1)    // --->it has only read() func to read data.
        {
            System.out.print((char)ch);
        }
       // System.out.println((char)f.read());   --->It gives only a character from the file
        f.close();
        }
        catch(FileNotFoundException ie)
        {
            System.out.println("Exception :- "+ie);
        }
        catch(IOException ioe)
        {
            System.out.println("Exception 2 :- "+ioe);
        }
    }
}

//Use Of File Class.
import java.io.*;
public class io5 
{
    public static void main(String[] args) 
    {
        File myfile=new File(args[0]);    //"C:\\Users\\KIIT\\Desktop\\Display\\Programming\\JAVA\\mypack1.java"
        FileReader f=null;
        try {f=new FileReader(myfile);}
        catch (FileNotFoundException fnf) {System.out.println("Exception 1 :- "+fnf);        }
        PrintWriter pw=new PrintWriter(System.out,true);
        int ch;
        try{
        while((ch=f.read())!=-1)
        {
            pw.print((char)ch);
        }
            }
            catch(IOException ioe)
            {pw.println("Exception 2 :- "+ioe);}
            pw.close();
    //     FileWriter fw=null;
    //    try {
    //         fw=new FileWriter("C:\\Users\\KIIT\\Desktop\\Display\\Programming\\JAVA\\mypack1.java");
    //         fw.write("Inside Write");
    //         fw.close();
    //         }
    //    catch(FileNotFoundException fnf){System.out.println("Exception 3 :- "+fnf);}
    //    catch(IOException ioe){System.out.println("Exception 4 :- "+ioe);}

    }    
}

//File class Basic;
import java.io.*;
public class io6 
{
    public static void main(String[] args) 
    {
        File f=new File("content1.txt");
        PrintWriter pw=new PrintWriter(System.out);
        pw.println("getname = "+f.getName());
        pw.println("getPath = "+f.getPath());
        pw.println("getPath = "+f.getAbsolutePath());
        pw.println("getparent = "+f.getParent());
        pw.println("exist = "+f.exists());
        pw.println("isAbsolute = "+f.isAbsolute());
        pw.println("isDirectory = "+f.isDirectory());
        pw.println("isFile= "+f.isFile());
        pw.println("canRead = "+f.canRead());
        pw.println("canWrite = "+f.canWrite());
        pw.println("last Modified = "+f.lastModified());
        pw.println("length = "+f.length());
        pw.println("rename = "+f.renameTo(new File("content1.txt")));
        pw.println("Delete = "+f.delete());
        pw.close();
    }
    
}

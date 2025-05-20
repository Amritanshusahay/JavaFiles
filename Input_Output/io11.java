import java.io.*;
public class io11 
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter pw=new PrintWriter(System.out);
        File source=new File("abc.txt");
        File destination =new File("content.txt");
        
        RandomAccessFile raf1=new RandomAccessFile(source,"r");
        RandomAccessFile raf2=new RandomAccessFile(destination,"rw");

        raf2.seek(raf2.length());

        byte[] data1=new byte[200];
        byte[] data2=new byte[(int)(raf2.length()+raf1.length())];

        raf1.read(data1);//,0,(int)source.length());
        raf2.write(data1);//,0,50);

        raf2.seek(0);
        raf2.read(data2);
        pw.println(new String(data2));

        pw.close();
        raf1.close();
        raf2.close();
    }    
}

import java.io.*;
public class io3 {
    public static void main(String[] args) {
        FileReader f=null;
        String content="";
        try{f=new FileReader("C:\\Users\\KIIT\\Desktop\\Display\\Programming\\JAVA\\mypack1.java");}
        catch(FileNotFoundException fnf){System.out.println("Exception 1 :- "+fnf);}
        BufferedReader bfr=new BufferedReader(f);
        try{  String s="";
              while((s=bfr.readLine())!=null)       //Here it gives null when it reaches the end of the file.
                {content+=s+"\n";}
            // while((bfr.readLine())!=null)  --->Here we call readLine() twice that's why one line is read at condition & it is not write in "content".
            // {content+=bfr.readLine()+"\n";}
            }
        catch(IOException ioe){System.out.println("Exception 2 :- "+ioe);}
        
        // FileWriter fw=null;
        // try{fw=new FileWriter("content.txt");}                   --->To write content in a file
        // catch(IOException ioe){System.out.println("Exception 1 :- "+ioe);}
        
        BufferedWriter bfw=new BufferedWriter(new OutputStreamWriter(System.out));//To write Content on the Console.  //fw); Towrite in a file.
         try
         {
            bfw.write("File Content :- \n"+content);
            bfw.close();
          }
          catch(IOException ioe)
          {
            System.out.println("Exception :- "+ioe);
          }
    }
}

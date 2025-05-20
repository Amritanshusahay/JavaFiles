//Runtime Error check it.

import java.io.*;
public class io7 
{
    public static void main(String[] args) 
    {
        File f=new File("content1.txt");
        PrintWriter w=new PrintWriter(System.out,true);
        FileInputStream finput=null;
        try { finput=new FileInputStream(f);   }
        catch (FileNotFoundException fnf) {w.println("Exception 1 :- "+fnf);  }
        // catch (IOException ioe) {w.println("Exception 2 :- "+ioe);  }
        if(f.exists())
        {
        long l=f.length();
        int content[]=new int[(int)l/4];
        int i=0;

        try{
             while((content[i++]=finput.read())!=-1);
             }
        catch(IOException ioe){w.println("Exception 3 :- "+ioe);    }
      
        FileOutputStream foutput=null;
        try {foutput=new FileOutputStream("content.txt");} 
        catch (FileNotFoundException ioe) {w.println("Exception 4:- "+ioe); }
        
        try{
        for(int j=0;j<i;j++)
        { foutput.write(content[j]);}
          foutput.close();
          }
        catch(IOException ioe){w.println("Exception 3 :- "+ioe);    }
      }
    }    
}

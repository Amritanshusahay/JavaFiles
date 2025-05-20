import java.io.*;
public class io4 {
    public static void main(String[] args) 
    {
//     FileWriter f=null;
//     try{ f=new FileWriter("C:\\Users\\KIIT\\Desktop\\Display\\Programming\\JAVA\\mypack1.java");}
//    // catch(FileNotFoundException fnf){System.out.println("Exception 1 :-"+fnf);}
//     catch(IOException ioe){System.out.println("Exception 2 :- "+ioe);}
    PrintWriter writer=new PrintWriter(System.out);
    writer.append("Inside the append");
    writer.print("\nIn Print"+45);
    writer.printf("\nIn Printf %d",45);
    writer.write("\nIn Write"); //It doesn't work without flush
    writer.close();
    }
    
}

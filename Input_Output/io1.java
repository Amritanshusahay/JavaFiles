import java.io.*;
public class io1 {
    
    public static void main(String[] Amritanshu)
    {
        String name="";
        System.out.print("Enter Your Name :- ");
        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
         try
           {
              name=bfr.readLine();  //read() is for one character
              }
         catch(IOException io)
           {
             System.out.println("Exception :- "+io);
             }
        System.out.println("Name :- "+name);

        BufferedWriter bfw=new BufferedWriter(new OutputStreamWriter(System.out));
            try
             {
                bfw.write("Your name :- "+name);
                bfw.close();
              }   
             catch (IOException e) 
             {
               System.out.println("Exception :- "+e); 
               }

    }
}

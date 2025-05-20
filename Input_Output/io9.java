import java.io.*;
public class io9 {
    public static void main(String[] args) 
    {
        byte cities[]={'D','e','l','h','i','\n','B','h','u','b','a','n','e','s','w','a','r'};
        System.out.println(cities);
        try(FileOutputStream f=new FileOutputStream("abc.txt"))
        {
            int i=0;
            f.write(cities);
        }
        catch(IOException ioe)
        {
            System.out.println("Exception :- "+ioe);
        }
    }
}

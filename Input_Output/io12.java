import java.io.*;
abstract class Employee
{
    String id;
    String name;
    float basicsalary;
    String content;
    abstract void calculate();
    abstract void extract();
    void input()
    {
        int ch;
        content="";
        try(FileReader f=new FileReader("emp.txt"))
        {
            while((ch=f.read())!=-1)
            {content+=(char)ch;}
        }
        catch(IOException ioe)
        {System.out.println("Exception in Input :- "+ioe);}
        calculate();
        extract();
    }
    static void display(String data)
    { 
       
        try(FileWriter fw=new FileWriter("emp1.txt"))
        {
            fw.write(data);
        }
        catch(IOException ioe)
        {
            System.out.println("Exception in Disp :- "+ioe);
        }
     }
}
class FullTime extends Employee
{
    String Fcontent="";
    public void calculate()
    {

     }
    void extract()
    {
        int start=content.indexOf("Fid= ")+5;
        int end=content.indexOf("\n",start); 

        id=content.substring(start,end);
        System.out.println(id);

        start=content.indexOf("Fname= ")+7;
        end=content.indexOf("\n",start); 
        name=content.substring(start,end);
        System.out.println(name);
        
        start=content.indexOf("Fbasicsalary= ")+14;
        end=content.indexOf("\n",start); 
        String sal=content.substring(start,end);
        System.out.println(sal);
        Fcontent ="Full Time Employee \n";
        Fcontent+="Fid = "+id+"\nFname = "+name+"\nSalary = "+sal+"\n";
    }
}
class HalfTime extends Employee
{
    String Hcontent="";
    public void calculate()
    {
        
    }
    void extract()  
    {
        int start=content.indexOf("Hid= ")+5;
        int end=content.indexOf("\n",start); 
        id=content.substring(start,end);
        
        start=content.indexOf("Hname= ")+7;
        end=content.indexOf("\n",start); 
        name=content.substring(start,end);
        
        start=content.indexOf("Hbasicsalary= ")+14;
        end=content.indexOf("\n",start); 

        String sal=content.substring(start,end);
        
        Hcontent="\nHalf Time Employee \n";
        Hcontent+="Hid = "+id+"\nHname = "+name+"\nHSalary = "+sal;
     }
}
public class io12 
{
    public static void main(String[] args) 
    {
        FullTime ft=new FullTime();
        ft.input();
        HalfTime ht=new HalfTime();
        ht.input();
        ht.display(ft.Fcontent+ht.Hcontent);
    }
}

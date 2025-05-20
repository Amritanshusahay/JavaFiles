public class practhread5 implements Runnable
{
    static int i=1;
    String msg;
    Thread t=null;
    practhread5(String s)
    {
       t=new Thread(this);
       msg=s;
       System.out.println(t.getName());
        t.start();
    }
    public void run()
     {  
    //     System.out.println("\n\nOnce More in Execution");
    //     System.out.println(this);
    //     System.out.println("Name :- "+this.getName());
    //     // System.out.println("Get Priority :- "+this.getPriority());
        // System.out.println("Is Alive :- "+this.isAlive());
        // System.out.println("Changing Priority :) ");
        // setPriority(getPriority()+1);
        // System.out.println("Get Priority :- "+this.getPriority());
        bracket();
    }
    synchronized void bracket()
    {
        System.out.print("[ "+msg);
        try{Thread.sleep(2000);}
        catch(InterruptedException ie)
        {
            System.out.println("except");
            }
        System.out.print("]");
    }
}

class Driver
{
 public static void main(String[] args) 
 {
    practhread5 t1=new practhread5("Hello");
    practhread5 t2=new practhread5("Hi");
    practhread5 t3=new practhread5("Bye");
    try
    {
        t1.t.join();
        t2.t.join();
        t3.t.join();
    }
    catch(InterruptedException ie)
    {
        System.out.println("Except");
    }
 }    
}

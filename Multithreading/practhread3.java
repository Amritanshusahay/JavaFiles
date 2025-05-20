//Multithreading by Runnable interface.
class Threadclass implements Runnable
{
    static int i=1;
    Thread t=null;
    Threadclass()
    {        
       t=new Thread(this,"Child Thread "+(i++));
        System.out.println(t.getName());
        t.start();
      //  System.out.println("Hello");
    }
    public void run()
    {
        //Thread t1=Thread.currentThread();
        System.out.println(t.getThreadGroup());
        System.out.println("Name :- "+t.getName());
        System.out.println("Get Priority :- "+t.getPriority());
    }
}

public class practhread3 
{
    public static void main(String[] args) 
    {
        Threadclass thre=new Threadclass();
    }    
}

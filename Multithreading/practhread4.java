class Threadclass implements Runnable
{  
    static int i=1;
    static int val=1;
    Thread t=null;
    Threadclass()
    {
      t =new Thread(this,"Child Thread "+(i++));
    }
    synchronized void func()
    {
        Thread t1=Thread.currentThread();
        val++;
        System.out.println("val = "+val+"Changed by :- "+t1.getName());
    }
    public void run()
    {
        Thread t1=Thread.currentThread();
        System.out.println("\nInside Run");
       func();
        System.out.println(t1.getState()+" "+t1.getName());
        System.out.println("outing run\n");
    }
}

public class practhread4
{
   public static void main(String[] args) 
    {  
        Threadclass obj1=new Threadclass();
        Threadclass obj2=new Threadclass();
        Threadclass obj3=new Threadclass();

        
        System.out.println(obj1.t.getState()+" "+obj1.t.getName());
        System.out.println(obj2.t.getState()+" "+obj2.t.getName());
        System.out.println(obj3.t.getState()+" "+obj3.t.getName());
              
        obj1.t.start();
        obj2.t.start();
        obj3.t.start();

        System.out.println(obj1.t.getState()+" 1 "+obj1.t.getName());
        System.out.println(obj2.t.getState()+" 2 "+obj2.t.getName());
        System.out.println(obj3.t.getState()+" 3 "+obj3.t.getName());
            
        //System.out.println(obj.t.NORM_PRIORITY);
        
        System.out.println();
        try{
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();            
            }
        catch(InterruptedException ie)
        {
            System.out.println("Exception ");
        }

        System.out.println(obj1.t.getState()+" "+obj1.t.getName());
        System.out.println(obj2.t.getState()+" "+obj2.t.getName());
        System.out.println(obj3.t.getState()+" "+obj3.t.getName());
            
    }    
}
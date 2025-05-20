public class thread2 
{
    public static void main(String[] args) 
    {
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
        t.setName("Mein Hu MAIN :)");
        System.out.println(t);
        System.out.println();
        try
        {   for(int i=0;i<5;i++)
            {
             Thread.sleep(2000);
             System.out.print(i+" ");
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println("Exception ho gaya :| ");
        }
        
    }    
}

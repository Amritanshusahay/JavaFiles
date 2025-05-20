class ThreadClass extends Thread implements Runnable
{
    ThreadClass() 
    {
        super("New Child ");
        System.out.println(this);
        System.out.println(this.getName());   
        System.out.println(this.getPriority());   
        start();  
    }
   /* public void run()
    {
      for(int i=0;i<5;i++)
       {
        System.out.println(i+" ");
         try
         {  Thread.sleep(2000);  }
         catch(InterruptedException ie)
         {
          System.out.println("Kya kiya be exception generate ho gaya :- "+ie);
         }
       }
    }
    */
}
class Driver
{
    public static void main(String[] Amritanshu)
    {
        ThreadClass tc1= new ThreadClass();
        }
}
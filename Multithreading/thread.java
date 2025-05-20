
class Driver
{
    public static void main(String[] Amritanshu) 
    {
     Thread t=Thread.currentThread();
     System.out.println(t);   
     System.out.println(t.getPriority());
     System.out.println(t.getName());
     t.setName("Threadwa");
     System.out.println(t.getName());   
     System.out.println(t.isAlive());   
     t.setPriority(7);
     System.out.println(t.getPriority());
     System.out.println(t);   
     }
}
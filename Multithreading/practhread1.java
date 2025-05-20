public class practhread1 extends Thread
{
    static int i=1;
    practhread1()
    {
        super("child Thread "+(i++));
        System.out.println(this);
        System.out.println("Name :- "+this.getName());
        System.out.println("Get Priority :- "+this.getPriority());
        System.out.println("Is Alive :- "+isAlive());
        System.out.println("Changing Priority :) ");
        setPriority(6);
        System.out.println(getThreadGroup());
        System.out.println("Get Priority :- "+this.getPriority());
        start();
    }
    public void run()
    {  
        System.out.println("\n\nOnce More in Execution");
        System.out.println(this);
        System.out.println("Name :- "+this.getName());
        System.out.println("Get Priority :- "+this.getPriority());
        System.out.println("Is Alive :- "+isAlive());
        System.out.println("Changing Priority :) ");
        setPriority(getPriority()+1);
        System.out.println("Get Priority :- "+this.getPriority());
    }
 public static void main(String[] args) 
 {
    new practhread1();
 }    
}

interface A //interface is bydefault public abstract 
{
    int age=21; //variables in interface are by default final and static bercause only methods are available on implemented class and not variables
    String name = "RV";
    void show();
    void config();
}

class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }

    public void config()
    {
        System.out.println("in config");
    }
   
}

public class interface1 {
    public static void main(String args[])
    {
        
       A obj;
       obj = new B();

       obj.show();
       obj.config();

       System.out.println("Age:" + A.age);
       System.out.println("name:" + A.name);

    }
}

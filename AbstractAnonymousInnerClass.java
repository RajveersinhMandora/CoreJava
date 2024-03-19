abstract class A{
    abstract public void show();
    public abstract void config();
}

public class AbstractAnonymousInnerClass {
    public static void main(String args[])
    {
        A obj = new A()
        {// this is declaration of anonymous class inside object declaration
            public void show()
            {
                System.out.println("THis is abstract anonymous inner class method Show");
            }
            public void config()
            {
                System.out.println("THis is abstract anonymous inner class method config");
            }
        };


        obj.show();
        obj.config();
        
    }
    
}

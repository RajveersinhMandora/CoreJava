class A{
    public void show()
    {
        System.out.println("this is A show");
    }
}

public class anonymousInnerClass {
    public static void main(String args[])
    {
        A obj = new A()
        {// this is declaration of anonymous class inside object declaration
            public void show()
            {
                System.out.println("This is Anonymous inner class");
            }
        };

        obj.show();
        
    }
    
}

@FunctionalInterface
interface A
{
    void show(int i);
}

public class functionalInterface_lambda 
{    public static void main (String args[])
    {
        A obj = (i) -> System.out.println("in show using lanbda expression '->' and @functionalInterface : "+ i);
        obj.show(9);
    }
}


/*
 * you can also do: 
 * A obj = new A()
 * {
 *      System.out.println("in show using lanbda expression '->' and @functionalInterface ");
 * };
 *  obj.show();
 */
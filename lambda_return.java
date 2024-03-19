@FunctionalInterface
interface A
{
    int show(int i,int j);
}

public class lambda_return 
{    public static void main (String args[])
    {
        //lambda expression works only with functional interface
        A obj = (i,j) -> i+j; // after '->' everything is by default return statement

        int result = obj.show(9,10);
        System.out.println("Addition of 9 and 10 is: " + result + " using lanbda");
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
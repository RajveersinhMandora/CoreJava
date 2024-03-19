class A
{
    int age;
    public void show()
    {
        System.out.println("THis is show mthod of A class");
    }
    
    public class B  // this is inner class(Class inside one class)
    {
        public void display()
        {
            System.out.println("this is display method of b class");
        }

    }
}



public class innerClass 
{
    public static void main(String args[])
    {
        A objA = new A(); // this is object of a class                              
        objA.show();

        A.B objB = objA.new B();// since B is A inner class Of A, we have to write "A.b" which indicates that b is a innerclass of A whenever making an object of the inner class
        objB.display();//also to create object of innerclass, object of outer class(A) is used eg:"objA.new B()"

    }    
}                           

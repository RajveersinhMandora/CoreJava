abstract class car //only abstract class can contain abstract method
    {   
        
        //abstract method is reserved for now and kept empty for using it in future whenever needed in other class
        public abstract void  drive();// for declaring abstract method the class must be abstract only
        
        public void playmusic()
        {
            System.out.println("playing music...");
        }
    }
class mycar extends car
{
    public void drive()
    {
        System.out.println("Using abstract method of abstracrt class in the extended class.");
    } 
}

public class abstractMethod
{
    public static void main(String args[])
    {
        //obj is reference variable of car (superclass) and "new mycar" is object of childclass stored it in 
        car obj = new mycar();// creating a reference variable of class "car" and then creating and storing object of "Mycar" class in the reference variable of "car" class 
        obj.drive();
        obj.playmusic();

    }
}

/*
 
The purpose of creating a reference variable is to provide a means to 
access and manipulate the object. In Java, you typically work with objects
through their reference variables. While you can directly create an object 
without assigning it to a reference variable, doing so limits your ability to 
interact with the object in your code.

\By creating a reference variable, you can perform various operations on the object,
such as calling its methods, accessing its properties, passing it as an argument to 
methods, and more. Without a reference variable, you would have no way to interact 
with the object beyond its creation.

So, in summary, while you can create an object without a reference variable, 
it's essential to create one if you intend to utilize the object's functionalities 
within your code. Both steps—creating an object and creating a reference variable—are 
integral parts of object-oriented programming in Java.
 */

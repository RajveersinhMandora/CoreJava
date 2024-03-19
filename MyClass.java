class calculator
{
    public int add(int num1, int num2)//receiveing value(num1,num2) from main class, performing addition and returning answer
    {
        int ans = num1 + num2;
        return ans;
    }
}


public class MyClass {
    public static void main(String args[])
    {
        int num1 = 4;
        int num2 = 2;

        calculator obj = new calculator(); //making object

        int result = obj.add(num1, num2); //calling add() method of calculator class by object and storing it in result variable

        System.out.println(result); 
    }
    
}

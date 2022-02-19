class ClassB
{
    public static int A = 5;
}
public class ClassA extends ClassB
{
    public static void main(String []args)
    {
        int B = ClassA.A;
        System.out.println(B);
    }
}
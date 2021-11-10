public class Odd {
    public Odd(int num)
    {
        if((num%2)==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    public static void main(String[] args)
    {
        Odd odd = new Odd(57);
    }
}
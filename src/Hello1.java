public class Hello1 extends Hello
{
    public Hello1()
    {
        System.out.println("Hello1 there!");
    }
    @Override
    public void displayMessage()
    {
        System.out.println("This is Hello1 Message.");
    }
    public void displayMessage(int message)
    {
        System.out.println(message);
    }
    public static void main(String[] args)
    {
        Hello hello = new Hello();
        Hello1 hello1 = new Hello1();
        int message = 5;
        //method overriding
        hello.displayMessage();
        hello.findMeIfYouCan=5;
        hello.displayMessage(hello.findMeIfYouCan);

        hello1.displayMessage();
        //method overloading
        hello1.displayMessage(message);
        //return 0;
    }
}

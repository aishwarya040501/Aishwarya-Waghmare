import java.util.*;
 public class Maximum
{
    public static void main(String[]args)
    {
        int a=0;
        int b=0;
        Scanner S=new Scanner (System.in);
        System.out.println("Enter a first number");
        a=S.nextInt();
        System.out.println("ENter a second number");
        b=S.nextInt();
        if(a>b)
        {
            System.out.println("First Number Is Maximum");
        }
        else if(b>a)
        {
            System.out.println("Second Number Is MaXimum");
        }
        else
        {
            System.out.println("Both Number Are Same");
        }

    }
}
import java.util.*;

public class Table
{
    public static void main(String[] args)
    {
        int Num = 0, i = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number : ");
        Num = s.nextInt();

        for(i = 1; i <= 10; i++)
        {
            System.out.println(Num + " * " + i + " = " + Num*i); 
        }
    }
}
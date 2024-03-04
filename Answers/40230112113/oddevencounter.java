package t1;

import java.util.Scanner;

public class oddevencounter
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();
        Boolean searchforeven = sc.nextBoolean();
        
        sc.close();
        if (searchforeven==true)
        {
            for (int i=0;i<number.length();i++)
            {
                if ((number.charAt(i)%2)==0)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
        else if (searchforeven==false)
        {
            for (int i=0;i<number.length();i++)
            {
                if ((number.charAt(i)%2)!=0)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
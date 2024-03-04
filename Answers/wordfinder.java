package t1;

import java.util.Scanner;

public class wordfinder{
    public static void main(String[] args)
    {
        String s;
        int n , spaces=0 , start=0;

        Scanner sc= new Scanner (System.in);
        s = sc.nextLine();
        n = sc.nextInt();
        sc.close();

        if (n>=s.length())
        {
            System.out.println(n+" is out of Bound");
            System.exit(0);
        }

        else
        { 
            for (int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==' ')
                {
                   spaces++;
                   if(spaces==n-1)
                   {
                        start=j;
                   }
                }
            }
            if(n-1>spaces)
            {
                System.out.println(n+" is out of bound");
            }
            else
            {
                for(int i=start+1;i<s.length();i++)
                {   
                    if (s.charAt(i)==' ')
                    {
                        System.exit(0);
                    }
                    else
                    {
                        System.out.print(s.charAt(i));
                    }
                }
            }
        }
    }
}
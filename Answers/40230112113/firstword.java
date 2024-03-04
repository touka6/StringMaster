package t1;

import java.util.Scanner;

public class firstword
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String wordA = sc.nextLine();
        String wordB = sc.nextLine();

        sc.close();
        is_firstword(wordA , wordB);
        
    }
    public static void is_firstword(String A , String B)
    {
        int bigger;
        if (A.charAt(0)>B.charAt(0))
        {
            System.out.println(B);
        }
        else if (A.charAt(0)<B.charAt(0))
        {
            System.out.println(A);
        }
        else if(A.charAt(0)==B.charAt(0))
        {
            if(A.length()>B.length())
            {
                System.out.println(B);
            }
            else if(A.length()<B.length())
            {
                System.out.println(A);
            }
            else if(A.length()==B.length())
            {
                for (int i=1;i<A.length();i++)
                {
                    if(A.charAt(i)>B.charAt(i))
                    {
                        System.out.println(B);
                    }
                    else if(A.charAt(i)<B.charAt(i))
                    {
                        System.out.println(A);
                    }
                    else continue;
                }
            }
        }
        /*
            ###***bebakhshida vali dige maghzam kar nemikone***###
        */
    }
}

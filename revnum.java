import java.io.*;
import java.util.*;
class revnum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=0;
        int i;
        while(a>0)
        {
            i=a%10;
            r=r*10+i;
            a=a/10;
        }
        System.out.println(r);
    }
}



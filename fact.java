import java.io.*;
import java.util.*;
class Fac
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int fact=1;
     int i;
     if(a!=0)
     {
         for(i=1;i<=a;i++)
         fact=fact*i;
         
     }
     System.out.println(fact);
    }
}

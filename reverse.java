import java.io.*;
import java.util.*;
class Rev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuffer s=new StringBuffer(a);
        s.reverse();
        System.out.println(s);
    }
}

import java.io.*;
import java.util.*;
class working
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    String b=a.toLowerCase();
    if(b.equals("monday")||b.equals("tuesday")||b.equals("wednesday")||b.equals("thursday")
    ||b.equals("friday")||b.equals("saturday"))
    {
        System.out.println("True");
    }
    else if(b.equals("sunday"))
    {
        System.out.println("false");
    }
    else
    {
        System.out.println("invalid");
    }
}
}

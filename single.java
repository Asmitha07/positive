import java.io.*;
import java.util.*;
import java.text.*;
import java.util.Arrays;
class single
{
 
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
int len=b.length;

for(int i=0;i<len;i++)
 {
  b[i]=sc.nextInt();
  }
Arrays.sort(b);
for(int i=0; i<len; i++)
       {
    if(b[i]==b[(i+1)%len])
{
}
else if(b[i]==b[(i-1)%len])
{

}
else
{
System.out.println(b[i]);
}
}
}
}

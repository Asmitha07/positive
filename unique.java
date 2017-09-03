public class unique {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int count=0;
		char ch[]=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{ 
		
			if(ch[i]!='a')
		   {
			int d=(int)ch[i]-1;
			System.out.print((char)d);
			}
		else if(ch[i]=='a' && count==0)
		{   count=count+1;
			System.out.print("z");
		}
		else
		{
			System.out.print("a");	
		}
		}
}
}

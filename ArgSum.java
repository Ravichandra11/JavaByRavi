class ArgSum
{
	public static void main(String[] args)
	{
		int s=0;
		for(int i=0;i<args.length;i++)
		{
			int x=Integer.parseInt(args[i]);
			s=s+x;
		}
	System.out.println("Sum is:"+s);
	}
}
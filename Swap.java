class Swap
{
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.print("Before Swapping 2 Numbers:");
		System.out.println("\t"+a+"\t"+b);
		int t=a;
		a=b;
		b=t;
		System.out.print("After Swapping 2 Numbers:");
		System.out.println("\t"+a+"\t"+b);
	}
}
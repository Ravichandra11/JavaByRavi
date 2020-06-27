class AreaTriangle
{
	public static void main(String[] args)
	{
		double a,b,c,s,area;
		a=Double.parseDouble(args[0]);
		b=Double.parseDouble(args[1]);
		c=Double.parseDouble(args[2]);
		s=(a+b+c)/2.0;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of the Triangle is:"+area);
	}
}
class CompInterest
{
	public static void main(String[] args)
	{
		double p,r,n,amt,ci;
		p=Double.parseDouble(args[0]);
		r=Double.parseDouble(args[1]);
		n=Double.parseDouble(args[2]);
		amt=p*Math.pow((1+(r/100.0)),n);
		ci=(int)amt-p;
		System.out.println("Compound Interest is:"+ci);
	}
}
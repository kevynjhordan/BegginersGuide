package Chapter1JavaFundamentals;

class BlockDemo 
{
	public static void main(String argrs[])
	{
		double i, j, d;
		
		i = 5;
		j = 10;
		
		if(i != 0)
		{
			System.out.println("i does not equal zero");
			d = j / i;
			System.out.println("j / i is " + d);
		}
	}
}
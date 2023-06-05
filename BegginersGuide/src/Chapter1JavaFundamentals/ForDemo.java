package Chapter1JavaFundamentals;

class ForDemo 
{
	public static void main(String argrs[])
	{
		int count;
		
		for (count = 0; count < 5; count = count+1)
			System.out.println("this is count: " + count);
		
		System.out.println("done!");
	}
}

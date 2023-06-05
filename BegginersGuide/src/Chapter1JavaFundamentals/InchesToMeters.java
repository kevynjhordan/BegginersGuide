package Chapter1JavaFundamentals;

class InchesToMeters 
{
	public static void main(String argrs[])
	{
		double inches, meters, fs;
		inches = 1; 
		fs = 0;
		
		for (inches = 1; inches <= 144; inches ++)
		{
			meters = inches / 39.37;
			System.out.println(inches + " inches are equal to " + meters + " meters");
			fs ++;
			
			if (fs == 12)
			{
				System.out.println();
				fs = 0;
			}
		}
	}
}
package Chapter2IntroducingDataTypesAndOperators;

class VarInitDemo 
{
	public static void main(String argrs[])
	{
		int x;
		for(x = 0; x < 3; x++)
		{
			int y = -1;
			System.out.println("y is: " + y);
			
			y = 100;
			System.out.println("y is now: " + y);
		}
	}
}
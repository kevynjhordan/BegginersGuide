package Chapter2IntroducingDataTypesAndOperators;

class NestVar 
{
	public static void main(String argrs[])
	{
		int count;
		
		for(count = 0; count < 10; count = count + 1)
		{
			//int count;
			for(count = 0; count < 2; count++)
			{
				System.out.println("this program is in error!");
			}
		}
	}
}
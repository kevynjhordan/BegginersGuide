package Chapter2IntroducingDataTypesAndOperators;

class SideEffects 
{
	public static void main(String argrs[])
	{
		int i;
		
		i = 0;
		
		if(false & (++i < 100))
			System.out.println("this won't be displayed");
		System.out.println("if statement executed: " + i);
		
		if(false && (++i < 100))
			System.out.println("this won't be displayed");
		System.out.println("if statement executed: " + i);
	}
}
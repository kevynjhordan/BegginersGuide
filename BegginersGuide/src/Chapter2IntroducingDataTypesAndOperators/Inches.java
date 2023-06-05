package Chapter2IntroducingDataTypesAndOperators;

class Inches 
{
	public static void main(String argrs[])
	{
		long ci;
		long im;
		
		im = 5280 * 12;
		
		ci = im * im * im;
		
		System.out.println("there are " + ci +
							" cubic inches in cubic mile.");
	}
}
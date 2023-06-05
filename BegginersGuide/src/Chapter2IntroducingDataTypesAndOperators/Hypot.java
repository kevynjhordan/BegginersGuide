package Chapter2IntroducingDataTypesAndOperators;

class Hypot 
{
	public static void main(String argrs[])
	{
		double x, y, z;
		
		x = 3;
		y = 4;
		
		z = Math.sqrt(x*x + y*y);
		
		System.out.println("hypotenuse is " + z);
	}
}
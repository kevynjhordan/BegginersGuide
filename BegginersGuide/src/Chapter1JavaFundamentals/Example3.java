package Chapter1JavaFundamentals;

class Example3 
{
	public static void main(String argrs[])
	{
		int var;
		double x;
		
		var = 10;
		
		x= 10.0;
		
		System.out.println("original value of var: " + var);
		System.out.println("original value of x: " + x);
		System.out.println();
		
		var = var / 4;
		x = x / 4;
		
		System.out.println("var after division: " + var);
		System.out.println("x after division: " + x);
		
	}
}
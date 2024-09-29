package student;

public class Arithematic {
	private static Arithematic operation;
	// (((((10+2)*2)-2)*2)/2)
	public int addition(int a, int b)
	{
		int c;
		c= a+b;
		System.out.println("Result is =" +c);
		return c;
	}
	public int multiply(int d, int e)
	{
		int f;
		f= d*e;
		System.out.println("Result is =" +f);
		return f;
	}
	public int subtract(int g, int h)
	{
		int i;
		i= g-h;
		System.out.println("Result is =" +i);
		return i;
	}
	
	public void division(int j, int k)
	{
		int l;
		l= j/k;
		System.out.println("Result is =" +l);
	}
	public static void main(String[] args)
	{
		Arithematic.operation = new Arithematic();
		int z = operation.addition(10,2);
		int x = operation.multiply(z,2);
		int m = operation.subtract(x,2);
		int u = operation.multiply(m,2);
		operation.division(u,2);
		
	}

}

package student;

public class Arithematic1 {
	private static Arithematic1 operation1;
	// (((((10/2)-2)*2)-2)+2)
	public int division(int a, int b)
	{
		int c = a/b;
		System.out.println("Value is = " +c);
		return c;
	}
	public int subtract(int d, int e)
	{
		int f = d-e;
		System.out.println("Value is = " +f);
		return f;
	}
	public int multiply(int g, int h)
	{
		int i = g*h;
		System.out.println("Value is = " +i);
		return i;
	}
	public void addition(int j, int k)
	{
		int l = j+k;
		System.out.println("Value is = " +l);
		}
	public static void main(String[] args) {
		Arithematic1.operation1 = new Arithematic1();
		int z = operation1.division(10,2);
		int x = operation1.subtract(z,2);
		int m = operation1.multiply(x,2);
		int u = operation1.subtract(m,2);
		operation1.addition(u,2);
	}

}

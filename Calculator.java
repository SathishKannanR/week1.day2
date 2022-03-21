package week2.day2;

public class Calculator {
	
	public int add(int a,int b)
	{
	    int sum=a+b;
		return sum;
	}
	public double subtract(double c, double d)
	{
		double sub=c-d;
		return sub;
	}
	
	public double multiply(double c, double d)
	{
		return (c*d);
	}
	 public double divide(double c, double d)
	 {
		 return (c/d);
	 }
	

	public static void main(String[] args) {
		
	Calculator cal= new Calculator();
	System.out.println(cal.add(20, 80));
	System.out.println(cal.subtract(20.5, 15.4));
	System.out.println(cal.multiply(20.5, 15.4));
	System.out.println(cal.divide(205.5, 80.3));
		

	}

}

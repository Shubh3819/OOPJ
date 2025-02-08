class rectangle {
	static double length,breadth;
	rectangle(double l, double b)
	{
		length = l;
		breadth = b;
		
	}
	rectangle() 
	{
		length = breadth = 0;
	}
	
	static double area() 
	{ 
		return length*breadth;
	}
}
public class lab4_6{
	public static void main(String args[])
	{
		rectangle r1 = new rectangle();
		rectangle r2 = new rectangle(10, 20);
		double area=rectangle.area();
		System.out.println("the area of rectangle is " + area);
	}
}

import java.util.*;
class lab4_5
{
	static double area(double r)
	{
		double ar=((22/7)*r*r);
		return ar;
	}
	static double area(double b,double h)
	{
		double ar=(0.5*b*h);
		return ar;
	}
	static int area(int l)
	{
			int ar=(l*l);
			return ar;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for circle, 2 for triangle, 3 for square");;
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("enter radius of circle");
			double r=sc.nextDouble();
			double ar=area(r);
			System.out.println("The area of circle is"+ar);
		}
		else if(n==2)
		{
			System.out.println("Enter the length and height of triangle");
			double l=sc.nextDouble();
			double h=sc.nextDouble();
			double ar=area(l,h);
			System.out.println("The are of triangle is "+ar);
		}
		else if(n==3)
		{
					System.out.println("enter length of square");
					int l=sc.nextInt();
					int ar=area(l);
					System.out.println("The area of square is"+ar);
		}
		else
		{
			System.out.println("Error");
		}
	}
}

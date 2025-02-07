import java.util.*;
class days
{
     public static void main(String []args)
      {
	  Scanner sc=new Scanner(System.in);
	  int day;
	  int m;
	  System.out.print("Enter your date:");
	  day=sc.nextInt();
	  m=day%7;
	  switch(m){
	  case 0:
	  System.out.println("The date is Sunday");
	  break;
	  case 1:
	  System.out.println("The date is Monday");
	  break;
	  case 2:
	  System.out.println("The date is Tuesday");
	  break;
	  case 3:
	  System.out.println("The date is Wednesday");
	  break;
	  case 4:
	  System.out.println("The date is Thursday");
	  break;
	  case 5:
	  System.out.println("The date is Friday");
	  break;
	  case 6:
	  System.out.println("The date is Saturday");
	  break;
	  default:
	  System.out.println("Enter a valid date");
	  }
	  }
}

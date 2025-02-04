import java.util.*;
class marks
{
     public static void main(String []args)
      {
	  Scanner sc=new Scanner(System.in);;
	  int marks;
	  System.out.print("Enter your marks:");
	  marks=sc.nextInt();
	  if(marks>90&&marks<100)
	  {
	  System.out.println("Your grade is O");
	  }
	  else if(marks>80&&marks<90)
	  {
	  System.out.println("Your grade is E");
	  }
	  else if(marks>70&&marks<80)
	  {
	  System.out.println("Your grade is A");
	  }
	  else if(marks>60&&marks<70)
	  {
	  System.out.println("Your grade is B");
	  }
	  else if(marks>50&&marks<60)
	  {
	  System.out.println("Your grade is C");
	  }
	  else if(marks>40&&marks<50)
	  {
	  System.out.println("Your grade is D");
	  }
	  else if(marks<40&&marks>-1)
	  {
	  System.out.println("Your grade is F");
	  }
	  else{
	  System.out.println("Enter valid marks");
	  }
    }
}

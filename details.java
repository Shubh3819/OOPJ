import java.util.*;
class details
{
     public static void main(String []args)
      {
            Scanner sc=new Scanner(System.in);
			String name;
			String branch;
			String sec;
            int roll;
System.out.println("Enter your Name:");
name=sc.nextLine();
System.out.println("Enter your Branch:");
branch=sc.nextLine();
System.out.println("Enter your Section:");
sec=sc.nextLine();
System.out.println("Enter your Roll:");
roll=sc.nextInt();
System.out.println("The details of the student is:");
System.out.println(name);
System.out.println(branch);
System.out.println(sec);
System.out.println(roll);

       }
}

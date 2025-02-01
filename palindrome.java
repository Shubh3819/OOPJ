import java.util.*;
class palindrome
{
     public static void main(String []args)
      {
	  Scanner sc=new Scanner(System.in);
	  int p=0;
	  int q=0;
	  int a=0;
	  int b=0;
	  System.out.print("Enter your number:");
	  p=sc.nextInt();
	  while(p!=0){
	  a=p%10;
	  b=(b*10)+a;
	  p=p/10;
	  }
	  
	  if(p==b){
	  System.out.println("Your number is palindrome");
	  }
	  else{
	  System.out.println("Your number is not a palindrome");
	  }
	 }
}

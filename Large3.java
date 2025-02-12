//Find the largest among 3 user entered nos. at the command prompt using Java
import java.util.Scanner;

public class Large3{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int[] a = new int[3];
		int largest=0;
		System.out.print("Enter three number: ");
		for (int i = 0; i<3;i++) {
            a[i] = input.nextInt();
        }
		
		for (int i=0;i<3; i++) {
            if(a[i]>largest){
			largest=a[i];
		}
		}
		System.out.println("The largest number is: " + largest);
	}
}
		
		

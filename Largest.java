import java.util.Scanner;

public class Largest{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		int largest=0;
		for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            a[i] = input.nextInt();
        }
		
		for (int i = 0; i < 10; i++) {
            if(a[i]>largest){
			largest=a[i];
		}
		}
		System.out.println("The largest number is: " + largest);
	}
}
		
		

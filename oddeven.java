//Accept 10 numbers from command line and check how many of them are even and how many are odd.
import java.util.Scanner;

public class oddeven{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		int odd=0;
		int even=0;
		for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            a[i] = input.nextInt();
        }
		
		for (int i = 0; i < 10; i++) {
            if(a[i]%2==0){
			even++;
		}
		else{
		odd++;
		}
		
	}
	System.out.println("Odd:"+odd);
	System.out.println("Even:"+even);
}
}
		
		

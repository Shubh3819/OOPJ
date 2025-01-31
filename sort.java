import java.util.Scanner;

class sort {
    
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int n = input.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            a[i] = input.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}

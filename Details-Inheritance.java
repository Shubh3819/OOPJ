import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        acc_no = scanner.nextInt();
        System.out.print("Enter balance: ");
        balance = scanner.nextDouble();
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter Aadhar number: ");
        aadhar_no = scanner.nextLong();
    }

    @Override
    public void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class lab4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person[] persons = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input();
        }

        System.out.println("\nDetails of three persons:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Person " + (i + 1) + ":");
            persons[i].disp();
            System.out.println();
        }

        scanner.close();
    }
}

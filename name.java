import java.util.Scanner;

public class name{
    public
 
static
 
void
 
main(String[] args)
 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String first= scanner.nextLine();

        System.out.print("Enter your last name: ");
        String last=scanner.nextLine();

        // Concatenate last name and first name with a comma and space
        String formattedName = last+" "+first;

        System.out.println("Your name in the format of last name followed by first name:");
        System.out.println(formattedName);
    }
}

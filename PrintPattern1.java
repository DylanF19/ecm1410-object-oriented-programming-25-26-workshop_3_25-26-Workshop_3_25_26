import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintPattern1 {
    public static void main(String[] args) {
        // Declare Scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size: ");
        int size = input.nextInt(); // Reads in an int from standard input
        System.out.println();

        for (int i = 1; i<=size; ++i) {
            for (int j = 1; j <=i; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
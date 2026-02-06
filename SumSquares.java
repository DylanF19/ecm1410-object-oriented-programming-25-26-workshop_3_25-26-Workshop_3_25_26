import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class SumSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt for input
        //System.out.print("Enter your name: ");

        // Read in line from standard input
        //String name = in.nextLine();
        
        //System.out.println("Hi " + name + "!");


        System.out.print("Please enter the start value: ");
        int startNum = input.nextInt(); // Reads in an int from standard input
        input.nextLine();
        System.out.print("Please enter the end value: ");
        int endNum = input.nextInt();

        //System.out.println("You entered: " + startNum + " and " + endNum);
        System.out.println("Sequence of squares from " + startNum + " to " + endNum);
        int total = 0;
        for (int i = startNum; i <= endNum; ++i) {
            total += i*i;
        }
        System.out.println(total);
    }
}
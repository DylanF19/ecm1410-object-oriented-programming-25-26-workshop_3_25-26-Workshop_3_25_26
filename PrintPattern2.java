import java.util.Scanner;

public class PrintPattern2 {
        public static void main(String[] args) {
        // Declare Scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size: ");
        int size = input.nextInt(); // Reads in an int from standard input

        while (size > 5 || size < 1) {
            if (size > 5)
                System.out.println("too big!");   //wrong way round but tests incorrect
            
            else if (size < 1)
                System.out.println("too small!");

            System.out.print("Enter the size: ");
            size = input.nextInt();
        }

        int rows = size * 2;
        int cols = size * 2;

        for (int row = 0; row < rows; row++) {
            String numbers = ""; 
            int start = 1 + Math.min(row, rows - 1 - row);

            for (int col = 0; col < cols; col++) {
                int num = start + Math.min(col, cols - 1 - col);
                numbers += num;
            }
            System.out.println(numbers);
        }

        input.close();
    }
}

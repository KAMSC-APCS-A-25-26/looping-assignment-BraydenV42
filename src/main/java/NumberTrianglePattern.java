import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
        // TODO: Step 1 - Get user input
        System.out.print("Enter a positive integer: ");
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println(" ");

        // TODO: Step 2 - Generate the number triangle pattern
        for(int i = 0; i < number; i++) {
            for(int f = 0; f <= i; f++) {
                if (!(i + 1 == number)) {
                    System.out.print((f + 1) + " ");
                }
                else
                {
                    if(!(f+1 == number)) {
                        System.out.print((f + 1) + " ");
                    }
                    else {
                        System.out.print((f + 1));
                    }
                }
            }
            System.out.println();
        }
    }
}
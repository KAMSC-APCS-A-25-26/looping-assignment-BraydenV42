import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {     
        // TODO: Step 1 - Get user input
        System.out.print("Enter an integer value: ");
        Scanner sc = new Scanner(System.in);
        int number, total = 0;
        number = sc.nextInt();

        // TODO: Step 2 - Validate input
        if(number > 2){
            for(int i = 0; i <= number; i += 2) {
                total += i;
            }
            System.out.println("The sum of even numbers between 2 and 10 is " + total);
        }
        else{
            System.out.println("Error: Input must be 2 or greater.");
        }
    }
}

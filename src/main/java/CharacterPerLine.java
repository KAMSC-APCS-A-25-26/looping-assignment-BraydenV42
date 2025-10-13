import java.util.Scanner;

public class CharacterPerLine {
    public static void main(String[] args) {        
        // TODO: Step 1 - Get user input
        System.out.print("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String word;
        word = sc.nextLine();
        // TODO: Step 2 - Print each character on a separate line
        for(int i = 0;  i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}

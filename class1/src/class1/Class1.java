package class1;

import java.util.Random;
import java.util.Scanner;

public class Class1 {

    public static void main(String[] args) {
        int i, flag = 0;
        String guess;
        char input;
        String word = "australia";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\n Enter your guess");
            input = sc.nextLine();
            for (i = 0; i < word.length(); i++) {
                if (word.charAt(i) == input.charAt(0)) {
                    (flag = 1;
                }
                )

            }
            if (flag == 1) {
                System.out.println("This letter is peresent in next line");
            } else {
                System.out.println("This letter is not peresent in next line");
            }
            System.out.println("Do you want to guesss again(y/n)");
            guess = sc.nextLine();
            flag = 0;
        } while (guess.equals("y") || guess.equals("y"));

    }

}

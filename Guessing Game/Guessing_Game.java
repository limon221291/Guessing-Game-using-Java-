import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {

    public static void game() {
        System.out.println("\t------------------------GUESSING GAME------------------------\t");
        System.out.println("Welcome to guessing game!");
        System.out.print("\nDo you want to play the game now? (Y/N):  ");

        Scanner in = new Scanner(System.in);
        char choice1 = in.next().charAt(0);
        System.out.println();

        if (choice1 == 'Y' || choice1 == 'y') {
            System.out.println(
                    "Please note: [ You have exactly 3 attempts to win the game.\nIf you guess correctly within these 3 attempts you'll win the game otherwise The Bot will be the winner. ]");
            System.out.println("\n");
            // generate random numbers from 0 to 9:
            Random r = new Random();
            int rnum = r.nextInt(9);

            // check if user input is correct or wrong:

            for (int i = 1; i <= 3; i++) {
                System.out.println("[Attempt- " + i + "] : ");
                System.out.print("Choose a number between 0 to 9:  ");
                int choice_num = in.nextInt();

                System.out.println();

                if (rnum == choice_num) {
                    System.out.println("Congrats! You won the game.");
                    break;
                } else {
                    if (i != 3) {
                        System.out.println("Wrong number, guess correctly!");
                        System.out.println((3 - i) + " attempts left");
                        System.out.println("\n");
                    } else {
                        System.out.println("Wrong number!");
                        System.out.println((3 - i) + " attempts left! Better luck next time");
                        System.out.println("Bot won the game!");
                    }
                }
            }
        } else if (choice1 == 'N' || choice1 == 'n') {
            System.out.println("Thank you for being with me!");
        } else {
            System.out.println("Wrong input!");
        }
    }

    public static void main(String[] args) {

        // clear screen before game menu appears:
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // calling game menu:
        game();
    }
}

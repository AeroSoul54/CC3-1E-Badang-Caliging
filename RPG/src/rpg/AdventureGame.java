package rpg;

import java.io.*;
import static rpg.TestCharacter.startGame;

public class AdventureGame {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static TestCharacter testcharacter;
    public static Character character;
    public static Dice dice;

    public static void main(String args[]) throws IOException {
        System.out.println("Injustice 2: Arcade Mode");
        TestCharacter.mainMenu();
        short choice = Short.parseShort(br.readLine());
        switch (choice) {
            case 1:
                startGame();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }
}

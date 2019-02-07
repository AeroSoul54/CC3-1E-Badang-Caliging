package rpg;

import java.io.*;

public class TestCharacter {

    static Dice dice = new Dice();
    static Dice dice2 = new Dice();

    public static void mainMenu() {
        System.out.print("[1] Start Game\n"
                + "[2] Exit\n"
                + "Enter your choice: ");
    }

    public static void startGame() throws IOException {
        Character Nightwing = new Character("Nightwing",dice.roll(), dice.roll(), dice.roll());
        Character Red_Hood = new Character("Red Hood", dice2.roll(), dice2.roll(), dice2.roll());
        System.out.println("");
        boolean n = true;
        int i = 1;
        while (i <= 3) {
            System.out.println("Round " + i + ": FIGHT!"); //Round Initialization
            System.out.println("");
            System.out.println("Red Hood = " + Red_Hood.CurrentLife + " hp \t" + "Nightwing = " + Nightwing.CurrentLife + " hp");
            System.out.print("\nNightwing swings at Red Hood for " + Nightwing.attack() + " damage");
            Red_Hood.CurrentLife -= Nightwing.damage;
            if(Red_Hood.CurrentLife <=0){
                System.out.println("\nRed Hood gives up");
                break;
            }
            System.out.print( "\nRed Hood shoots Nightwing for " + Red_Hood.attack() + " damage");
            Nightwing.CurrentLife -= Red_Hood.damage;
            if (Nightwing.CurrentLife <=0){
                System.out.println("\nNightwing gives up");
                break;
            }
            if (Red_Hood.CurrentLife <= 0) {
                Red_Hood.CurrentLife = 0;
                break;
            }
            if (Nightwing.CurrentLife <= 0) {
                Nightwing.CurrentLife = 0;
                break;
            }
            System.out.println("\nRed Hood = " + Red_Hood.CurrentLife + " hp \t" + "Nightwing = " + Nightwing.CurrentLife + " hp");
            System.out.println("");//Termination of Round
            i++;
        }

        if (Red_Hood.CurrentLife <= 0 || Nightwing.CurrentLife <= 0) {
            n = false;
        }
        if (Red_Hood.CurrentLife < Nightwing.CurrentLife) { //Nightwing win
            System.out.println("");
            System.out.println("Final result:"
                    + "\nRed Hood = " + Red_Hood.CurrentLife + " hp\t"
                    + "\nNightwing = " + Nightwing.CurrentLife + " hp");
        }
        System.out.println("");
        if (Red_Hood.CurrentLife > Nightwing.CurrentLife) { //red Hood win
            System.out.println("Final result:"
                    + "\nRed Hood = " + Red_Hood.CurrentLife + " hp\t"
                    + "\nNightwing = " + Nightwing.CurrentLife + " hp");
        }
        if (Nightwing.CurrentLife < Red_Hood.CurrentLife ) { //Red Hood Winning
            System.out.println("\nRed Hood won");
        } else if (Red_Hood.CurrentLife < Nightwing.CurrentLife) {   //Nightwing Winning
            System.out.println("\nNightwing won");
        } else if (Nightwing.CurrentLife == 0 && Red_Hood.CurrentLife == 0) { //Draw, if it comes to this point
            System.out.println("\nDraw :>");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave_2;

/**
 *
 * @author slmns
 */
import java.util.Scanner;

public class Opgave_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner scan = new Scanner(System.in);
        Player player = new Player("", 0);
        Game spil = new Game(player);

        System.out.println("What game do you want to play");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");

        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Dig og huset kaster 10 gange med en 6-sidede terning");
                System.out.println(spil.playgame1());
                break;

            case 2:
                System.out.println("Dig og huset kaster 5 gange med en 12-sidede terning og 5 gange med en 24-sidede terning");
                System.out.println(spil.playgame2());
                break;
            case 3:
                System.out.println("Dig og huset kaster en 6-sidede terning og hvis resultat er mellem 1 og 3 kaster man med en 12-sidede terning ellers kaster man med en 10-sidet terning");
                System.out.println(spil.playgame3());
                break;
            default:
                System.out.println("You cant choose a number under 1 or over 3");
                break;
        }
    }

}

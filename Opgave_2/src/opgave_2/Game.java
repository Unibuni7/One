/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave_2;

import java.util.Scanner;

/**
 *
 * @author slmns
 */
public class Game {

    private int playerpoint = 0;
    private int husetspoint = 0;
    Die die = new Die(6);
    Die die2 = new Die(12);
    Die die3 = new Die(24);
    Die die4 = new Die(10);
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    Player player = new Player(name, playerpoint);
    Player house = new Player("Huset", husetspoint);
    GameResult gameresult = new GameResult();

    public Game(Player player) {

        this.player = player;
        this.house = house;

    }

    public GameResult playgame1() {
        for (int i = 0; i < 10; i++) {

            playerpoint = playerpoint + die.throwDie();
        }
        for (int j = 0; j < 10; j++) {
            husetspoint = husetspoint + die.throwDie();
        }

        if (playerpoint < husetspoint) {
            gameresult.setWinner(husetspoint);
            gameresult.setWinnername("Huset");
            gameresult.setLoser(playerpoint);
            gameresult.setLosername(name);

        } else {
            gameresult.setWinner(playerpoint);
            gameresult.setWinnername(name);
            gameresult.setLoser(husetspoint);
            gameresult.setLosername("Huset");

        }
        //  GameResult result = new GameResult();

        return gameresult;
    }

    public GameResult playgame2() {
        for (int i = 0; i < 5; i++) {
            this.playerpoint = this.playerpoint + die2.throwDie();
        }
        for (int i = 0; i < 5; i++) {
            this.playerpoint = this.playerpoint + die3.throwDie();
        }

        for (int i = 0; i < 5; i++) {
            this.husetspoint = this.husetspoint + die2.throwDie();
        }
        for (int i = 0; i < 5; i++) {
            this.husetspoint = this.husetspoint + die3.throwDie();
        }
        if ((this.playerpoint % 2) == 0) {
            this.playerpoint = this.playerpoint + this.playerpoint;
        } else if ((this.husetspoint % 2) == 0) {
            this.husetspoint = this.husetspoint + this.husetspoint;
        }

        if (this.playerpoint < this.husetspoint) {
            gameresult.setWinner(husetspoint);
            gameresult.setWinnername("Huset");
            gameresult.setLoser(playerpoint);
            gameresult.setLosername(name);

        } else {
            gameresult.setWinner(playerpoint);
            gameresult.setWinnername(name);
            gameresult.setLoser(husetspoint);
            gameresult.setLosername("huset");
            
        }

        return gameresult;

    }

    public GameResult playgame3() {
        this.playerpoint = this.playerpoint + die.throwDie();
        if (1 <= this.playerpoint && 3 >= this.playerpoint) {
            this.playerpoint = this.playerpoint + die2.throwDie();
        } else {
            this.playerpoint = this.playerpoint + die4.throwDie();
        }

        this.husetspoint = this.husetspoint + die.throwDie();
        if (1 <= this.husetspoint && 3 >= this.husetspoint) {
            this.husetspoint = this.husetspoint + die2.throwDie();
        } else {
            this.husetspoint = this.husetspoint + die4.throwDie();
        }

        if (this.playerpoint < this.husetspoint) {
            gameresult.setWinner(playerpoint);
            gameresult.setWinnername(name);
            gameresult.setLoser(husetspoint);
            gameresult.setLosername("Huset");
           
        } else {
            gameresult.setWinner(husetspoint);
            gameresult.setWinnername("Huset");
            gameresult.setLoser(playerpoint);
            gameresult.setLosername(name);
            
        }

        return gameresult;
    }

}

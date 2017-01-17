/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave_2;

import opgave_2.Player;
import java.util.Scanner;

/**
 *
 * @author slmns
 */
public class GameResult {

   private int Winner;
   private int Loser;
   private String Winnername;
   private String Losername;

    public String getWinnername() {
        return Winnername;
    }

    public void setWinnername(String Winnername) {
        this.Winnername = Winnername;
    }

    public String getLosername() {
        return Losername;
    }

    public void setLosername(String Losername) {
        this.Losername = Losername;
    }
   

    public int getWinner() {
        return Winner;
    }

    public void setWinner(int Winner) {
        this.Winner = Winner;
    }

    public int getLoser() {
        return Loser;
    }

    public void setLoser(int Loser) {
        this.Loser = Loser;
    }

    @Override
    public String toString() {
        return  getWinnername() + " Won with: " + getWinner()+ " and "+ getLosername()+ " lost with: " 
                + getLoser();
    }

}

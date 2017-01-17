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
public class Die {
    private int antalsider;

    public Die(int antalsider) {
        this.antalsider = antalsider;
    }

    
    
    public int throwDie(){
        int die = (int)(Math.random()*this.antalsider)+1;
        return die;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author ACER
 */
public class bus extends vehicle{
    private int numberofeats;

    public int getNumberofeats() {
        return numberofeats;
    }

    public void setNumberofeats(int numberofeats) {
        this.numberofeats = numberofeats;
    }

    @Override
    public String toString() {
        return "bus{" + "numberofeats=" + numberofeats + '}';
    }

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain.of.responsibility.pattern;

/**
 *
 * @author ACER
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         chain chain = new chain();
         
        //Calling chain of responsibility
        chain.process(new Number(90));
        chain.process(new Number(-50));
        chain.process(new Number(0));
        chain.process(new Number(91));
    }
    
}

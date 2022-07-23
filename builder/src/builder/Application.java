/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author ACER
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BurgerBuilder vegBurger = new BurgerBuilder();
		vegBurger.addBread("Brown Bread");
		vegBurger.addPatty("Veggie");
		vegBurger.addVeggies("Pickles");
		vegBurger.addSauce("All");
		vegBurger.addCheeze();
                vegBurger.build();
    }
    
}

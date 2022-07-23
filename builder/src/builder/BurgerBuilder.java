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
public class BurgerBuilder {
        private Burger burger;	

	public BurgerBuilder () { this.burger = new Burger(); }
 	public void addBread(String bread) { burger.setBread(bread); }
 	public void addPatty(String patty ) { burger.setPatty(patty); }
 	public void addVeggies(String veggies ) { burger.setVeggies(veggies ); }
 	public void addSauce(String sauce) { burger.setSauces(sauce); }
 	public void addCheeze() { burger.setWithExtraCheese(Boolean.TRUE); }
 	public Burger build() { return this.burger; }
}

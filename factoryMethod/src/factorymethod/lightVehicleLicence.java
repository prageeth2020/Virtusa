/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author ACER
 */
public abstract class lightVehicleLicence extends licence {
    protected void createLicence(){
        vType.add(new Bike());
        vType.add(new Car());
        vType.add(new threeWheels());
    }
}

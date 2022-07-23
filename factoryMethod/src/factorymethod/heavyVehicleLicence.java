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
public abstract class heavyVehicleLicence extends licence {
    protected void createLicence(){
        vType.add(new bus());
        vType.add(new Lorry());
    }
}

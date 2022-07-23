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
public class licenceTypes {
    public static licence createPackge(String name){
        switch(name){
            case  "light" :
                return new lightVehicleLicence() {
            @Override
            protected void createLicenceType() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public abstract  class licence {
     protected List<vehicleTypes> vType = new ArrayList<>();
    
    public licence(){
        createLicenceType();
    }
    
    protected abstract void createLicenceType();
    
     public String toString() {
        return ("Licence Type -" + vType);
    }
}

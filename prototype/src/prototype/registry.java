/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class registry {
    private Map<vehicleType , vehicle> vehicles  = new HashMap<>();
    
    public registry(){
        this.initialize();
    }
    
    public vehicle getVehicle(vehicleType vType){
        vehicle v = null;
        try {
            v = (vehicle) vehicles.get(vType).clone();
        } catch (CloneNotSupportedException ex) {
           ex.printStackTrace();
        }
        return v;
    }
    private void initialize(){
        car car = new car();
        car.setEngineCapacity(200);
        car.setType("Mini");
        car.setFuelType("Petrol");
        
        bus bus = new bus();
        bus.setEngineCapacity(1000);
        bus.setFuelType("Desel");
        bus.setNumberofeats(54);
        
        vehicles.put(vehicleType.CAR , car);
        vehicles.put(vehicleType.BUS , bus);
    }
}

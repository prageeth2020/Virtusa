/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class progameLoader {

    public static volatile progameLoader loader;
    private progameLoader() throws Exception {
        if(loader != null){
            throw new Exception("please wait.Game is loading...");
        }
    }
    
    public static progameLoader getInstance(){
       if(loader==null){
            synchronized (progameLoader.class) {
                if(loader==null){
                    try {
                        loader = new progameLoader();
                    } catch (Exception ex) {
                        Logger.getLogger(progameLoader.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        }
        return loader;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author ACER
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long start;
        long end;

        start=System.currentTimeMillis();
        //let's get 1st instance
        progameLoader loader = progameLoader.getInstance();
        System.out.println(loader);
        end=System.currentTimeMillis();

        System.out.println(loader);
        System.out.println(start-end);


        start=System.currentTimeMillis();
        //let's get 2nd instance
        progameLoader loader2 = progameLoader.getInstance();
        System.out.println(loader2);
        end=System.currentTimeMillis();

        System.out.println(loader2);
        System.out.println(start-end);
        
    }
    
}

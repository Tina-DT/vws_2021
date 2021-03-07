package com.javatechie.app.sonar_example;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * PersonalMgmt!
 *
 */
public class App2 {

	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

    public static String[][] drivers = { 
        { "Fred", "Sue", "Pete" },
            { "Sue", "Richard", "Bob", "Fred" }, 
            { "Pete", "Mary", "Bob" }, };

    public static void main(String[] args) {

        Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();

        //unendliche Schnleife für Tests
        int zaehler   = 20;
        int dekrement = 1;
        while ( zaehler >=10 )   // welcher relationaler Operator ?
        {
          System.out.println( "zaehler ist:" + zaehler );
          zaehler = zaehler + dekrement ;
        }
        System.out.println( "zaehler war " + zaehler + " als er den Test nicht bestand");
        //Schleife End
        
        for (int i = 0; i < vehicles.length; i++) {
            String vehicle = vehicles[i];
            String[] driversList = drivers[i];

            Set<String> driverSet = new LinkedHashSet<String>();

            for (String driver : driversList) {
                driverSet.add(driver);
            }

            personnel.put(vehicle, driverSet);
        }

        { // Brackets just to scope driversList variable so can use again later
            // Example usage
            Set<String> driversList = personnel.get("helicopter");

            for (String driver : driversList) {
                System.out.println(driver);
            }
        }

        // Iterate through whole thing
        for (String vehicle : personnel.keySet()) {
            System.out.print(vehicle);
            System.out.print(": ");
            Set<String> driversList = personnel.get(vehicle);

            for (String driver : driversList) {
                System.out.print(driver);
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}
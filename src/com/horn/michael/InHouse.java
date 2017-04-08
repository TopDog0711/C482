/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horn.michael;

/**
 *
 * @author Mike
 */
public class InHouse extends Part{
    private int machineID;

    public InHouse(){};
    
    public InHouse(String name, double price, int inStock, int min, int max, int machineID){
         super(name, price, inStock,min, max);
         setMachineID(machineID);
         
    }
    
    public int getMachineID() {
        return machineID;
    }

    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }
    
}

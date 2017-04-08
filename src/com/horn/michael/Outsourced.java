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
public class Outsourced extends Part{
    
    public Outsourced(){};
    
    public Outsourced(String name, double price, int inStock, int min, int max, String companyName){
        super(name, price, inStock,min, max);
        setCompanyName(companyName);
        
    }
    
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    
}

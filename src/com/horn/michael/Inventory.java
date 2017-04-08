/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horn.michael;

import java.util.ArrayList;


/**
 *
 * @author Mike
 */
public class Inventory {
    
    public Inventory()
    {
        products = new ArrayList<>();
        parts = new ArrayList<>();
    }
    
    private int nextProductId = 1;
    private int nextPartID = 1;
    
    private ArrayList<Product> products;
    private ArrayList<Part> parts;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    
    public void addProduct(Product p){
        products.add(p);
        p.setProductID(nextProductId++);
    }
    
    public void addPart(Part p){
        parts.add(p);
        p.setPartID(nextPartID++);
        
        
    }
    
    public boolean removeProduct(int productID){
        return false;
    }
    
    public Product lookupProduct(int productID){
        return null;
    }
    
    public void updateProduct(int productID){
        
    }
    
    public Part lookupPart(int partID){
        
        for(Part p : parts)
        {
            if(p.getPartID() == partID)
            {
            return p;
            }
        }
        
        
        return null;
    }

    public int getNextProductId() {
        return nextProductId;
    }

    public void setNextProductId(int nextProductId) {
        this.nextProductId = nextProductId;
    }

    public int getNextPartID() {
        return nextPartID;
    }

    public void setNextPartID(int nextPartID) {
        this.nextPartID = nextPartID;
    }

    public ArrayList<Part> getParts() {
        return parts;
    }

    public void setParts(ArrayList<Part> parts) {
        this.parts = parts;
    }
    
            
}

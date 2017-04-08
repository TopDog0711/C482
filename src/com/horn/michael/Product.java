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
public final class Product {
    private ArrayList<Part> parts;
    private int productID;
    private String name;
    private double price;
    private int instock;
    private int min;
    private int max;
    
    public Product( String name, double price, int instock, int min, int max)
    {
       
       this.setName(name);
       this.setPrice(price);
       this.setInstock(instock);
       this.setMin(min);
       this.setMax(max);
        
    }

    public ArrayList<Part> getParts() {
        return parts;
    }

    public void setParts(ArrayList<Part> parts) {
        this.parts = parts;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInstock() {
        return instock;
    }

    public void setInstock(int instock) {
        this.instock = instock;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    
    public void addPart(Part p){
    
    }
    
    public boolean removePart(int partID){
        return false;
    }
    
    public Part lookupPart(int partID){
        return null;
    }
    
    public void updatePart(int partID){
        
    }
  
    
}

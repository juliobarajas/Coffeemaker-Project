package com.Spring2020.Project;

public class Coffee {
   
    private double coffeePrice;
    private String coffeeStrength;

    public Coffee(double cost) {

	coffeePrice = cost;
	coffeeStrength = "medium";	// Default strength
    }

    // Specific cost and strength
    public Coffee(double cost, String strength) {
	this.coffeePrice = cost;
	coffeeStrength = strength;
    }

    // Setter & Getters
    public String getStrength() {
	return coffeeStrength;
    }

    public void setStrength(String strength) {
	coffeeStrength = strength;
    }

    public double getCost() {
	return coffeePrice;
    }

    public void setCost(double cost) {
	coffeePrice = cost;
    }

	  
}

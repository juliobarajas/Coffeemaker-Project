package com.Spring2020.Project;

public class Extras {
    // Separate class for extras will make it easy to add on to
    private String name;
    private double cost;

    public Extras(String name, double cost) {
	this.name = name;
	this.cost = cost;
    }
   
    // Setters & Getters
    public String getName() {
	return name;
    }
    public void setName(String name) {
	this.name = name;
    }
    public double getCost() {
	return cost;
    }
    public void setCost(double cost) {
	this.cost = cost;
    }
   
}

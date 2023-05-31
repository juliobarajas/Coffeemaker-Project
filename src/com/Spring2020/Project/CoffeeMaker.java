package com.Spring2020.Project;

public class CoffeeMaker {
    
    private boolean lifted;	 // Keeps trap of whether or not the pot is lifted
    private boolean indicator;	// Keeps track of the indicator being on or off
    private String forceOfSpray; // Keeps track of spray force according to the type of coffee
    private int brewingStage;	// Keeps track of brewing stage
    private Coffee coffee;

    public CoffeeMaker(Coffee coffee) {
	this.coffee = coffee;
	this.lifted= true;
	this.indicator = false;
	this.brewingStage = 0;
    }

    public Coffee getCoffee() {
	return coffee;
    }

    public void setCoffee(Coffee coffee) {
	this.coffee = coffee;
    }

    public boolean isIndicator() {
	return indicator;
    }

    public void setIndicator(boolean indicator) {
	this.indicator = indicator;
    }

    private void prepareBoiling() {
	System.out.println("Closing the pressure relief valve");
	System.out.println("Boiler: on");			
    }

    private void finishedBoiling() {
	System.out.println("Boiler Heater: off");
	System.out.println("Opening the pressure relief valve");
    }

    public void interruptBrewing() {
	removePot();
	finishedBoiling();
	if(indicator)
	    System.out.println("Brewing Interupted: turning off indicatior");
    }

    public void replacePot() {
	this.lifted = false;
	System.out.println("Plate Warmer: on");
	prepareBoiling();
	this.setForceOfSpray(coffee.getStrength());
	this.setIndicator(true);
    }

    public void removePot() {
	System.out.println("Plate Warmer: off");
	this.lifted = true;
    }
    public int brew() {
	int i = brewingStage;

	// Executes at first stage and increments it
	if (i == 0) {
	    prepareBoiling();
	    this.setForceOfSpray(coffee.getStrength());
	    System.out.println("Indicator: On");
	    this.setIndicator(true);
	    System.out.println("Brewing");
	    brewingStage = brewingStage + 1;
	    return brewingStage;
	}

	// Increment brewing stage each time this is ran
	else if(i > 0 && i < 4) {
	    System.out.println("Brewing");
	    brewingStage = brewingStage + 1;
	    return brewingStage;
	}

	// Executes if coffee is brewed beyond regular stages
	else {
	    finishedBoiling();
	    System.out.println("Finished Brewing");
	    return brewingStage;
	}
    }  
    // Setters & Getters
    public String getForceOfSpray() {
	return forceOfSpray;
    }

    public void setForceOfSpray(String forceOfSpray) {
	this.forceOfSpray = forceOfSpray;
    }

    public int getBrewingStage() {
	return brewingStage;
    }

    public void setBrewingStage(int brewingStage) {
	this.brewingStage = brewingStage;
    }
}

package com.Spring2020.Project;

public class User {
    private CoffeeMaker coffeeMaker;
    private Extras[] extras;
   
    public User(CoffeeMaker coffeemaker ,Extras[] extras) {
        this.coffeeMaker = coffeemaker;
        this.extras = extras;
    }
   
    public void brewCoffee() {
	// Displays upon first time commencement of brewing
	if(coffeeMaker.getBrewingStage() == 0) {
            System.out.println("Putting empty pot on warmer");
            System.out.println("Filling boiler with water");
            System.out.println("Putting filter and coffee grounds into filter holder");
            System.out.println("Loading the receptacle");
            System.out.println("selecting " + coffeeMaker.getCoffee().getStrength() + " coffee strength");
            System.out.println("Pressing brew button");
            coffeeMaker.brew();
        }
        else {
            coffeeMaker.brew();  
        }
    }
    public double pour() {
	// Calculate total cost
	double cost = 0;
	cost = cost + coffeeMaker.getCoffee().getCost();
	for(Extras e:extras){
	    cost = cost + e.getCost();
	}
	return cost;
    }

    // Setters & Getters
    public CoffeeMaker getCoffeemaker() {
        return coffeeMaker;
    }

    public void setCoffeemaker(CoffeeMaker coffeemaker) {
        this.coffeeMaker = coffeemaker;
    }

    public Extras[] getExtras() {
        return extras;
    }

    public void setExtras(Extras[] extras) {
        this.extras = extras;
    }
}

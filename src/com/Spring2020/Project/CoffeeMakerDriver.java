package com.Spring2020.Project;

// Julio Barajas

public class CoffeeMakerDriver {
    public static void main(String[] args) {

	// Coffee Lady during the morning....
	Coffee c1 = new Coffee(1.10,"Medium");
	CoffeeMaker machine = new CoffeeMaker(c1);
	Extras[] e1 = new Extras[1];
	e1[0] = new Extras("Whip",1.25);
	User coffeeLady = new User(machine,e1);

	// Brew 3/4 times
	coffeeLady.brewCoffee();
	coffeeLady.brewCoffee();
	coffeeLady.brewCoffee();

	// Interrupt coffee making process 
	coffeeLady.getCoffeemaker().interruptBrewing();
	coffeeLady.getCoffeemaker().replacePot();

	System.out.println("The cost is: $" + coffeeLady.pour());
	// Skip a line
	System.out.println();

	// Coffee Lady during the evening.....
	Coffee c2 = new Coffee(1.10,"light");
	machine.setCoffee(c2);
	machine.setBrewingStage(0);

	e1 = new Extras[1];

	// Cinnamon will be $1.75
	e1[0] = new Extras("cinnamon",1.75);
	coffeeLady.setExtras(e1);

	//Brewing 1/4 times
	coffeeLady.brewCoffee();

	coffeeLady.getCoffeemaker().interruptBrewing();
	coffeeLady.getCoffeemaker().replacePot();
	
	coffeeLady.brewCoffee();
	coffeeLady.brewCoffee();
	coffeeLady.brewCoffee();
	coffeeLady.brewCoffee(); // Finish Brewing at this stage
	// Display price
	System.out.println("The cost is: $" + coffeeLady.pour());
	// Skip a line
	System.out.println();

	// The Friend's coffee will default to medium
	Coffee c3 = new Coffee(1.10);

	machine.setCoffee(c3);
	machine.setBrewingStage(0);

	e1 = new Extras[1];
	e1[0] = new Extras("mocha",0.90);
	coffeeLady.setExtras(e1);

	// Full brewing done
	coffeeLady.brewCoffee();
	coffeeLady.brewCoffee();
	coffeeLady.brewCoffee();
	coffeeLady.brewCoffee();
	// Display Price
	System.out.println("The cost is: $" + coffeeLady.pour());

    }
}

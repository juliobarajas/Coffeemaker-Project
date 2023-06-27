# Coffeemaker-Project Demo
Coffee maker program written in Java using object oriented programming (OOP).
### Brewing a coffee at medium strength from user's perspective
![First Output](/src/com/Spring2020/Images/Output1.png?raw=true "Output One")

## Breakdown 
#### Initializing
Create a new coffee, machine, and extras object. Then a new user object called coffeeLady is created and initialized.

![Initialize](/src/com/Spring2020/Images/initialized.png?raw=true "Initialized")

 In this example we are creating a coffee at medium strength. Creating these objects prepares the coffee maker for brewing. 
 
The following code is ran in the background during this process:
```
Coffee c1 = new Coffee(1.10,"Medium");
CoffeeMaker machine = new CoffeeMaker(c1);
Extras[] e1 = new Extras[1];
e1[0] = new Extras("Whip",1.25);
User coffeeLady = new User(machine,e1);
```
#### Brewing
The coffee maker is ready for brewing.

![Brewing](/src/com/Spring2020/Images/brewing.png?raw=true "Brewed")

We call `coffeeLady.brewCoffee();` 3/4 times required to finish brewing.

#### Interrupting
In this example the coffee making process is interrupted during brewing through removal of the pot. 

![Interrupt](/src/com/Spring2020/Images/interrupted.png?raw=true "Interrupted")

we call `coffeeLady.getCoffeemaker().interruptBrewing();` to address this interruption. 

#### Replacing & Pouring
Then we want to replace the pot for the brewing process to continue and calulate the final cost.

![Replacing](/src/com/Spring2020/Images/replace.png?raw=true "Replaced")

 Call `coffeeLady.getCoffeemaker().replacePot();` to continue brewing. 
 Then `coffeeLady.pour();`once the user pours their coffee which automatically calculates the total cost and displays it.

package vehiculars;

public class vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println(name + " goes vroom vroom");
      }

    }

   // Create a Vehicle class with two properties: a name instance variable and a makeNoise() method. The instance variable should be private and have getters and setters (in IntelliJ try cmd-N). The makeNoise method should just sout out a typical vehiculars.vehicle noise. Then create a more specific vehiculars.vehicle subclass, such as Motorcycle, Car, Truck, Tractor, whatever. Make the specific vehiculars.vehicle class extend the Vehicle class. Otherwise, keep it empty. Create a test class, perhaps calling it VehicleTest Instantiate the specific vehiculars.vehicle, assign a value to the name property and run the methods on the specific vehiculars.vehicle. Notice the inherited method works and the inherited name property is assignable on the subclass.

    // Create a method in the subclass of the Vehicle class that overrides the superclass makeNoise method.

   // Create a breakingDownNoise() method in the subclass. It should call super.makeNoise() and then add a second sout that adds a second noise after the first one.

//Create a name-setter in your vehicle subclass. In your vehicle test, instantiate a specific vehicle and set its name. Sout out the name and verify that you do not get a stack overflow.

    //Create a new kind of vehicle that extends vehicle. Define the class as final. Create a makeNoise method that overrides the superclass method. Test it in your VehicleTest class. Now alter it so your subclass makeNoise method calls the superclass makeNoise method in addition to its own noise. Add one of your new kinds of vehicles to the array of vehicles in your Garage or Marina or Hangar and trigger the alarmCascade method to verify that your new car can exist in a polymorphic array. Add a subclass constructor that takes a String argument and make sure you have no errors.
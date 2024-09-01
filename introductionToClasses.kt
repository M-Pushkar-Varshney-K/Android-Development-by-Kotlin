// Base Class (Super Class)
open class Animal(val name: String, var age: Int) { // Primary Constructor
    init {
        println("Animal: $name, Age: $age") // Initialization block
    }

    // Method to demonstrate class functionality
    open fun makeSound() {
        println("$name makes a sound")
    }
}

// Derived Class (Single Inheritance)
class Dog(name: String, age: Int, var breed: String) : Animal(name, age) { // Inherits from Animal
    init {
        println("Breed: $breed")
    }

    // Overriding a method
    override fun makeSound() {
        println("$name barks")
    }
}

// Secondary Constructor Example
class Cat : Animal {
    var color: String

    // Secondary Constructor
    constructor(name: String, age: Int, color: String) : super(name, age) {
        this.color = color
        println("Color: $color")
    }
}

// Default Constructor and Parameterized Constructor Example
class Bird {
    var name: String
    var canFly: Boolean

    // Default Constructor
    constructor() {
        this.name = "Unknown"
        this.canFly = false
        println("Bird with Default Constructor: Name = $name, Can Fly = $canFly")
    }

    // Parameterized Constructor
    constructor(name: String, canFly: Boolean) {
        this.name = name
        this.canFly = canFly
        println("Bird with Parameterized Constructor: Name = $name, Can Fly = $canFly")
    }
}

// Copy Constructor Example
data class Fish(val name: String, val isFreshwater: Boolean) {
    // Copy Constructor is auto-generated in a data class
}

// Access Modifiers Example
class Zoo {
    private var animals: MutableList<Animal> = mutableListOf() // Private property

    fun addAnimal(animal: Animal) { // Public method (default)
        animals.add(animal)
        println("${animal.name} added to the zoo.")
    }

    fun showAnimals() {
        for (animal in animals) {
            println("Zoo has ${animal.name}")
        }
    }
}

fun main() {
    // Single Inheritance Example
    val dog = Dog("Rex", 5, "Golden Retriever")
    dog.makeSound()

    // Secondary Constructor Example
    val cat = Cat("Whiskers", 3, "Black")
    cat.makeSound()

    // Default and Parameterized Constructor Example
    val bird1 = Bird() // Default constructor
    val bird2 = Bird("Parrot", true) // Parameterized constructor

    // Copy Constructor Example
    val fish1 = Fish("Goldfish", true)
    val fish2 = fish1.copy(name = "Clownfish") // Copy with a modification
    println("Fish1: ${fish1.name}, Is Freshwater: ${fish1.isFreshwater}")
    println("Fish2: ${fish2.name}, Is Freshwater: ${fish2.isFreshwater}")

    // Access Modifiers Example
    val zoo = Zoo()
    zoo.addAnimal(dog)
    zoo.addAnimal(cat)
    zoo.showAnimals()
}

/*
Explanation:
Base Class (Animal):

This is the superclass with a primary constructor that takes name and age as parameters.
The makeSound() method is open, meaning it can be overridden by subclasses.
Single Inheritance (Dog):

Dog is a derived class that inherits from Animal. It has its own property breed.
The makeSound() method is overridden to provide a specific implementation for Dog.
Secondary Constructor (Cat):

Cat demonstrates the use of a secondary constructor. It uses super to call the primary constructor of the superclass Animal.
An additional property color is initialized in the secondary constructor.
Default and Parameterized Constructors (Bird):

Bird demonstrates both a default constructor (no arguments) and a parameterized constructor (with arguments).
Different constructors allow for flexibility in object creation.
Copy Constructor (Fish):

The Fish class is a data class, which automatically generates a copy constructor.
You can create a new Fish object by copying an existing one with modifications using copy().
Access Modifiers (Zoo):

The Zoo class contains a private property animals and public methods addAnimal() and showAnimals().
The private modifier restricts access to the animals list, encapsulating it within the class.
*/
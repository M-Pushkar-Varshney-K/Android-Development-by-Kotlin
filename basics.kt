fun main() {
    // Variable Declarations
    val intVar: Int = 10
    val floatVar: Float = 5.5f
    val doubleVar: Double = 12.34
    val longVar: Long = 123456789L
    val boolVar: Boolean = true
    val stringVar: String = "Hello, MPVK!"
    
    // Printing by String Manipulation and string catenation...
    println("Int Variable: " + intVar)// String catenation
    println("Float Variable: $floatVar")//String Manipulation
    println("Double Variable: " + doubleVar)// String catenation
    println("Long Variable: $longVar")//String Manipulation
    println("Boolean Variable: "+boolVar)// String catenation
    println("String Variable: $stringVar")//String Manipulation
    
    // If-Else Condition
    if (intVar > 5) {
        println("intVar is greater than 5")
    } else {
        println("intVar is less than or equal to 5")
    }
    
    // Nested If-Else Condition
    if (floatVar > 0) {
        if (floatVar < 10) {
            println("floatVar is between 0 and 10")
        } else {
            println("floatVar is 10 or more")
        }
    } else {
        println("floatVar is 0 or less")
    }
    
    // For Loop
    println("For Loop:")
    for (i in 1..5) {
        println("Iteration: $i")
    }
    
    // While Loop
    println("While Loop:")
    var counter = 0
    while (counter < 5) {
        println("Counter: $counter")
        counter++
    }
    
    // Do-While Loop
    println("Do-While Loop:")
    var counter2 = 0
    do {
        println("Counter2: $counter2")
        counter2++
    } while (counter2 < 5)
}

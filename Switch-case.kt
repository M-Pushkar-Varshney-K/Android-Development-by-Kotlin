fun main() {
    val dayOfWeek = 3 // Example input

    val dayName = when (dayOfWeek) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day" // Default case
    }

    println("Day of the week: $dayName")
}

/*Explanation:
when Expression: In Kotlin, when is the equivalent of the switch statement found 
in languages like Java or C++.
dayOfWeek Variable: The variable dayOfWeek is used to determine the day of the week.
-> Operator: Each when branch is followed by an arrow (->), and the result of that branch 
is returned.
else Case: The else branch is equivalent to the default case in a traditional switch statement. 
It handles any input that doesn’t match the specified cases.
This program will print the name of the day based on the dayOfWeek value. 
For instance, if dayOfWeek is 3, it will print "Day of the week: Wednesday". */

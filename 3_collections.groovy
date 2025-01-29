/*
  Collections and maps
*/
println 'LEST GO!'
//Creating an empty list
def technologies = []

// or create a list with data
technologies = ["Kotlin", "Swift"]

/*** Adding a elements to the list ***/

// As with Java
technologies.add("Grails")

// Left shift adds, and returns the list
technologies << "Groovy"

// Add multiple elements
technologies.addAll(["Gradle","Griffon"])

/*** Removing elements from the list ***/

// As with Java
technologies.remove("Griffon")

// Subtraction works also
technologies = technologies - 'Grails'

println 'DONE'
//Transforminator will show the return value
return technologies
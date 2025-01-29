/*
  Operators

  Operator Overloading for a list of the common operators that Groovy supports:
  http://www.groovy-lang.org/operators.html#Operator-Overloading

  Helpful groovy operators
*/

/*
The spread operator (*.) in Groovy is used to invoke a method or access a property on all elements of a collection. 
It simplifies the process of applying an operation to each element in the collection and collecting the results.
*/
def technologies = ['Groovy','Grails','Gradle']
technologies*.toUpperCase() // = to technologies.collect { it?.toUpperCase() }

/*
Iterate over each element in the technologies list and print each element.
Here's a breakdown of what the folowing code does:

1. technologies.each { tech -> ... }: 
   The each method is called on the technologies list. 
   It takes a closure (a block of code) as an argument and executes this closure for each element in the list.
2. { tech -> println tech }: 
   This is the closure passed to the each method. 
   The tech parameter represents the current element in the iteration. 
   The closure prints the value of tech.
*/

technologies.each { tech ->
    println tech
}

//simple User class definition
class User {
  String username
  String password
}

//Instantiate a user object
def user = new User()

/*
The ? in user?.username is the safe navigation operator in Groovy. 
It is used to avoid a NullPointerException when accessing properties or methods of an object that might be null.

Here's how it works:

1. If user is not null, user?.username will return the value of user.username.
2. If user is null, user?.username will return null instead of throwing a NullPointerException.

This is useful for safely navigating through potentially null objects without having to write explicit null checks.
*/

def username = user?.username
println "Username: ${username}"

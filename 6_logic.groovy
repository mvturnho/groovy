/*
  Logical Branching and Looping
*/
println 'LEST GO!'
//Groovy supports the usual if - else syntax
def x = 3

if (x == 1) {
    println 'One'
} else if (x == 2) {
    println 'Two'
} else {
    println 'X greater than Two'
}

/**
    Groovy also supports the ternary operator:
    The ternary operator is a shorthand for an if-else statement that assigns a value based on a condition. 
    It is represented by the ? : syntax. The ternary operator takes three operands:

    1. A condition to evaluate.
    2. The value to return if the condition is true.
    3. The value to return if the condition is false.
**/
def y = 10
def z = (y > 1) ? 'worked' : 'failed'

/*
    In Groovy, the assert statement is used to verify that a condition is true. 
    If the condition is false, an AssertionError is thrown, which can help identify bugs or incorrect assumptions in the code. 
    It's commonly used in testing and debugging to ensure that the code behaves as expected.

    You do not use this in normal code in opentunnel. only for debugging.
*/
assert z == 'worked'


//initialize a list of users
def userList = [
    [name: 'Alice', age: 30],
    [name: 'Bob', age: 25],
    [name: 'Charlie', age: 35],
    [name: null, age: 28]
]

/**
    Groovy supports 'The Elvis Operator' too!
    The Elvis operator (?:) in Groovy is a shorthand for the ternary operator when checking for null values.
    It returns the value on its left if it is not null, otherwise, it returns the value on its right.
**/

// Iterate through the userList and check for anonymous users
userList.each { user ->
    //test if user.name is has valid value
    def displayName = user.name ?: 'Anonymous'
    println "Name: ${displayName}, Age: ${user.age}"
}

println 'DONE'

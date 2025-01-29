/*
    Expando

    The Expando class is a dynamic bean so we can add properties and we can add
    closures as methods to an instance of this class

    https://docs.groovy-lang.org/latest/html/gapi/groovy/util/Expando.html

*/

// Create a new Expando instance with an initial property 'name'
/*
    Expando is a predefined class in Groovy. 
    It is part of the Groovy standard library and provides a dynamic bean that allows you to add properties 
    and methods at runtime. 
    You can use it to create flexible and dynamic objects without having to define a class explicitly.

    While you can name your own class User, 
    it would not have the same dynamic capabilities as Expando unless you explicitly implement similar functionality. 
    If you want to create a dynamic object like Expando, you should use the Expando class.
*/
def user = new Expando(name: "Roberto")

// Assert that the 'name' property is correctly set
assert 'Roberto' == user.name

// Dynamically add a new property 'lastName' to the Expando instance
user.lastName = 'Borough'

// Assert that the 'lastName' property is correctly set
assert 'Borough' == user.lastName

// Add a new method 'showInfo' to the Expando instance
user.showInfo = { out ->
    out << "Name: $name"
    out << ", Last name: $lastName"
}

// Create a StringWriter instance to capture the output of the 'showInfo' method
def sw = new StringWriter()

// Call the 'showInfo' method and print the result
println user.showInfo(sw) // Output: Name: Roberto, Last name: Pérez

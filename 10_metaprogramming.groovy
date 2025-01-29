/*
    Metaprogramming (MOP)
    Metaprogramming allows you to modify or extend the behavior of classes at runtime.
    Groovy provides several features for metaprogramming, including ExpandoMetaClass,
    method interception, and propertyMissing.
*/

// Using ExpandoMetaClass to add behavior to the String class
String.metaClass.testAdd = {
    println "we added this"
}

// Create a String instance and call the dynamically added method
String x = "test"
x?.testAdd() // Output: we added this

/*
  In this example, we use ExpandoMetaClass to add a new method 'testAdd' to the String class.
  This method prints "we added this" when called. We then create a String instance and call the new method.
*/

// Intercepting method calls using GroovyInterceptable
class Test implements GroovyInterceptable {
    // Define a method 'sum' that adds two integers
    def sum(Integer x, Integer y) { x + y }

    // Intercept method calls
    public def invokeMethod(String name, args) {
        System.out.println "Invoke method $name with args: $args"
    }
}

// Create an instance of the Test class and call methods
def test = new Test()
test?.sum(2, 3) // Output: Invoke method sum with args: [2, 3]
test?.multiply(2, 3) // Output: Invoke method multiply with args: [2, 3]

/*
    In this example, the Test class implements GroovyInterceptable, which allows it to intercept all method calls.
    The invokeMethod method is overridden to print the method name and arguments whenever a method is called 
    on the Test instance.
    When we call the sum and multiply methods, invokeMethod is called instead, and it prints the method details.
*/

/*
    Groovy supports propertyMissing for dealing with property resolution attempts

    propertyMissing is a predefined method in Groovy that you can override in your classes to handle attempts to 
    access properties that do not exist. When a property that is not defined in the class is accessed, Groovy will call 
    the propertyMissing method, allowing you to provide custom behavior for such cases.
 */
class Foo {
    // Handle missing properties
    def propertyMissing(String name) { name + ' does not exist!' }
}

// Create an instance of the Foo class and access a missing property
def f = new Foo()
def boo = f.boo
println boo // Output: boo

/*
    In this example, the Foo class defines a propertyMissing method to handle attempts to access undefined properties.
    When we try to access the 'boo' property on the Foo instance, propertyMissing is called,
    and it returns the property name.
    The assertion verifies that the returned value is "boo".
*/
/*
  TypeChecked and CompileStatic
  Groovy, by nature, is and will always be a dynamic language but it supports
  typechecked and compilestatic

*/

// Import the TypeChecked annotation
import groovy.transform.TypeChecked

// Define a method to be used in the test method
void testMethod() {}

// Example using @TypeChecked
@TypeChecked
void test() {
    // This will cause a compile-time error when the method name is misspelled
    testMethod()

    // Define a variable
    def name = "Roberto"

    // This will cause a compile-time error when the variable name is misspelled
    println name
}

/*
  In this example, the @TypeChecked annotation is used to enable compile-time type checking.
  The misspelled method name 'testMeethod' and variable name 'naameee' will cause compile-time errors.
*/

// Another example using @TypeChecked
@TypeChecked
Integer nsecondTest() {
    // This will cause a compile-time error when "1" is not an Integer
    Integer num = 1
    // Integer num = "1"

    // Define an array of integers
    Integer[] numbers = [1, 2, 3, 4]

    // This will cause a compile-time error when numbers[1] is not a Date
    Integer date = numbers[num]
    // Date date = numbers[num]

    // This will cause a compile-time error because "Test" is not an Integer
    return date
}

/*
  In this example, the @TypeChecked annotation is used to enable compile-time type checking.
  The incorrect type assignments will cause compile-time errors.
*/

// Import the CompileStatic annotation
import groovy.transform.CompileStatic

// Example using @CompileStatic
@CompileStatic
int sum(int x, int y) {
    return x + y
}

/*
  In this example, the @CompileStatic annotation is used to enable static compilation.
  The sum method will be compiled statically, providing type checking and performance improvements.
*/

// Example using @CompileStatic with incorrect types
@CompileStatic
void incorrectTypes() {
    // This will cause a compile-time error when "1" is not an Integer
    Integer num = 1
    // Integer num = "1"

    // Define an array of integers
    Integer[] numbers = [1, 2, 3, 4]

    // This will cause a compile-time error because numbers[1] is not a Date
    Integer date = numbers[num]
    // Date date = numbers[num]

    // This will cause a compile-time error because "Test" is not an Integer
    int result = date
}

/*
  In this example, the @CompileStatic annotation is used to enable static compilation.
  The incorrect type assignments will cause compile-time errors, similar to @TypeChecked.
*/
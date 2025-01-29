/*
    https://www.groovy-lang.org/documentation.html
    https://www.groovy-lang.org/syntax.html
*/

//  Single line comments start with two forward slashes

/*
Multi line comments look like this.
*/

// GroovyDoc comments start with two asterisks
// Groovydoc follows the same conventions as Java’s own Javadoc. So you’ll be able to use the same tags as with Javadoc.

/**
 * A Class description
 */
class Person {
    /** the name of the person */
    String name

    /**
     * Creates a greeting method for a certain person.
     *
     * @param otherPerson the person to greet
     * @return a greeting message
     */
    String greet(String otherPerson) {
       "Hello ${otherPerson}"
    }
}

// Hello World
println "Hello world!"

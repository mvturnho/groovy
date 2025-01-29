/*
  Closures
  A Groovy Closure is like a "code block" or a method pointer. It is a piece of
  code that is defined and then executed at a later point.

  More info at: http://www.groovy-lang.org/closures.html

  ATTENTION running this code takes at least 6 seconds to complete
*/

//Passing parameters to a closure
def sum = { a, b -> println a + b }
sum(2,4)

//Closures may refer to variables not listed in their parameter list.
def x = 5
def multiplyBy = { num -> num * x }
println multiplyBy(10)

// If you have a Closure that takes a single argument, you may omit the
// parameter definition of the Closure
def clos = { print it }
clos( "hi\n\n" )

/*
  Groovy can memoize closure results

  In Groovy, memoize is a method that can be used to optimize the performance of a closure 
  by caching the results of expensive function calls and returning the cached result when the same inputs occur again. 
  This technique is known as memoization.
*/

// Define a closure that performs an expensive computation
def cl = {a, b ->
    sleep(3000) // simulate some time consuming processing
    a + b
}
// Memoize the closure
mem = cl.memoize()
// Define the callClosure function
def callClosure(a, b) {
    def start = System.currentTimeMillis()
    mem(a, b)
    println "Inputs(a = $a, b = $b) - took ${System.currentTimeMillis() - start} msecs."
}

// Call the callClosure function with different inputs
callClosure(3, 4) // First call, should compute and print the time taken
callClosure(3, 4) // Second call, should use cached result and print the time taken
callClosure(5, 6) // New inputs, should compute and print the time taken
callClosure(5, 6) // Second call with same inputs, should use cached result and print the time taken
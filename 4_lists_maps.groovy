println 'LEST GO!'
//Creating an empty list
def technologies = []
// or create a list with data
technologies = ['Kotlin', 'Swift']
// As with Java
technologies.add('Grails')
// Add multiple elements
technologies.addAll(['Gradle', 'Griffon'])

/*** Iterating Lists ***/
println '_____________ Iterating  _________'
/*
    In Groovy, the each method is used to iterate over collections such as lists, arrays, maps, and ranges. 
    It allows you to execute a block of code for each element in the collection.
*/
technologies.each { println "Technology: $it" }
technologies.eachWithIndex { it, i -> println "$i: $it" }

/*** Checking List contents ***/
println '_____________ Checking List contents  _________'
//Evaluate if a list contains element(s) (boolean)
contained = technologies.contains('Groovy')
println '1 '  + contained
// Or
contained = 'Grails' in technologies
println  '2 ' + contained
// Check for multiple contents
contained = technologies.containsAll(['Groovy', 'Grails'])
println  '3 ' + contained

/*** Sorting Lists ***/
println '_____________ Sorting Lists  _________'
// Sort a list (mutates original list)
println '1 ' + technologies
// To sort without mutating original, you can do:
sortedTechnologies = technologies.sort(false)
println '2 ' + sortedTechnologies
//verify technologies is still the same
println '3 ' + technologies
technologies.sort()
println '4 ' + technologies

/*** Manipulating Lists ***/
println '_____________ Manipulating Lists  _________'
//Replace all elements in the list
Collections.replaceAll(technologies, 'Gradle', 'gradle')
println '1 ' + technologies
//Shuffle a list
Collections.shuffle(technologies, new Random())
println '2 ' + technologies
//Clear a list
technologies.clear()
println '3 ' + technologies

println '_____________ Manipulating Maps  _________'
//Creating an empty map
def devMap = [:]
println '1 ' + devMap

//Add values
devMap = ['name':'Roberto', 'framework':'Grails', 'language':'Groovy']
println '2 ' + devMap
devMap.put('lastName', 'Perez')
println '3 ' + devMap

//Iterate over elements of a map
println ''
println '4 key value'
devMap.each { println "$it.key: $it.value" }
println ''
println '5 index value'
devMap.eachWithIndex { it, i -> println "$i: $it" }

println '_____________ Checking Map contents  _________'
//Get the keys of a map
println '1 get yhe keys of a map'
println devMap.keySet()

//Get the values of a map
println '2 get the values of a map'
println devMap.values()

println 'DONE'

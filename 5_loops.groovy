//For loop
println 'LETS GO!'
/*
    Iterate over a range
    The output will be the cumulative sum of numbers from 0 to 30.
*/

println '____________ Iterate over a range _________'
def x = 0
for (i in 0 .. 30) {
    x += i
    println x
}

//Iterate over a list
println '____________ Iterate over a list _________'
for (i in [5, 3, 2, 1]) {
    println i
}

//Iterate over an array
println '____________ Iterate over an array _________'
array = (0..20).toArray()
for (i in array) {
    println i
}

//Iterate over a map
println '____________ Iterate over a map _________'
map = ['name':'Roberto', 'framework':'Grails', 'language':'Groovy']
x = ''
i = 0
for (e in map) {
    x <<= i += 2
    x <<= ' '
    x <<= e.value
    x <<= ' '
    println x
}

println 'DONE'
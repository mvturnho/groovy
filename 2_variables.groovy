/*
  Variables:

  You can assign values to variables for later use
*/
println 'LETS GO!'

/*
  In Groovy, the def keyword is used to define a variable without specifying its type explicitly. 
  It allows for dynamic typing, meaning the variable can hold any type of value, 
  and its type can change at runtime.
*/
def x = 1
println x

x = new java.util.Date()
println x

x = -3.1499392
println x

x = false
println x

x = "Groovy!"
println x

println 'DONE'

//Transforminator will show returnvalue in outputfile
return x
//Devuelve si lo introducido, transformado a String, es palindromo o no
def palindromo(X: Any): Boolean = {
  var cad = X.toString
  if( cad != cad.reverse) false
  else true
}

println(palindromo(111))
println(palindromo(135))
println(palindromo("abba"))
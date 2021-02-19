//Devuelve si lo introducido, transformado a String, es palindromo o no
def palindromo(X: Any): Boolean = {
  var cad = X.toString
  if( cad != cad.reverse) false
  else true
}

println(palindromo(111))
println(palindromo(135))
println(palindromo("abba"))

//Buscar los nº que son palindromos entre 1 y X
def listaPalindromos(X: Int): List[Int] = {
  for(i <- List.range(1,X+1) if palindromo(i))
    yield i
}

println(listaPalindromos(200))

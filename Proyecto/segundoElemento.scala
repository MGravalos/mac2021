//Devuelve el segundo elemento de una lista
def segundoElemento(X: List[Int]): Any= {
  if(X.size > 1)
    X(1)
  else
    null
}

println(segundoElemento(List(1)))
println(segundoElemento(List(1,2,3,4,5,6)))
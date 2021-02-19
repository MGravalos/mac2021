//Sacar el valor maximo de una lista
def maximoLista(X: List[Int]): Any = {
  if(X.size > 0) 
    X.max
  else
    null
}

println(maximoLista(List(1,2,3,4,5)))
println(maximoLista(List(3,6,1,5,1)))
println(maximoLista(List()))
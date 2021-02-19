//Devuelve una lista sin los dos primeros elementos
def let(X: List[Any]): List[Any] = {
  if (X.size > 2)
    X.drop(2)
  else
    null
}

println(let(List(1,2,3,4)))
println(let(List(1,2)))
println(let(List("A","B","C","D")))
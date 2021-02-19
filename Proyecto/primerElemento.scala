def soloPrimero(X: List[Any]): Any={
  if(X.size >0)
    X(0)
  else
    null
}

println(soloPrimero(List(1,2,3)))
println(soloPrimero(List("Hola","Mundo")))
println(soloPrimero(List()))
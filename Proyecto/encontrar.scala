//Encontrar en una listas de listas las listas que tienen un elemento X
def encontrar(X: Any, Lista: List[List[Any]]): Any = {
  for (L <- Lista if L.contains(X))
    yield L
  
}

var A = List("Pepe",1,5)
var B = List("Come",4,6)
var C = List("Come",5,7)
var D = List(1,"Pepe",4)

println(encontrar("Pepe",List(A,B,C,D)))
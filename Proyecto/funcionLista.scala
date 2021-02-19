//Muestra por consola los elementos de una lista
def funcionLista(X: List[Any]): Any = {
  if(X.size > 0)
    X.foreach(println)
  else
    print("Lista vacia")
}


funcionLista(List(1,2,3,4))
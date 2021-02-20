//miFuncion recibe una lista de funciones que se le aplica a la lista X
def miFuncion(F: List[(List[Any]) => List[Any]], X: List[Any]): List[Any] = {
  if(F.size > 0)
    F(0)(X) :: miFuncion(F.drop(1),X)
  else
    Nil
}

def suma1(X: List[Any]): List[Any] = {
  for (x <- X) yield x.toString.toDouble + 1
}

def suma2(X: List[Any]): List[Any] = {
  for (x <- X) yield x.toString.toDouble + 2
}

def suma3(X: List[Any]): List[Any] = {
  for (x <- X) yield x.toString.toDouble + 3
}
println(miFuncion(List(suma1,suma2,suma3),List(1,2,3)))
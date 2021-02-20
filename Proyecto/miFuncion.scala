//miFuncion1 recibe una lista de funciones que se le aplica a un elemento de la lista X cada una
def miFuncion(F: List[(Any) => Any], X: List[Any]): List[Any] = {
  if(F.size > 0)
    if(X.size > 0)
      F(0)(X(0)) :: miFuncion(F.drop(1),X.drop(1))
    else
      Nil
  else
    Nil
}


//miFuncion2 recibe una lista de funciones que se le aplica a la lista X de forma individual
def miFuncion2(F: List[(List[Any]) => List[Any]], X: List[Any]): List[Any] = {
  if(F.size > 0)
    if(X.size > 0)
      F(0)(X) :: miFuncion2(F.drop(1),X)
    else
      Nil
  else
    Nil
}

//Funciones auxiliares
def suma1(X: List[Any]): List[Any] = {
  for (x <- X) yield x.toString.toDouble + 1
}

def suma2(X: List[Any]): List[Any] = {
  for (x <- X) yield x.toString.toDouble + 2
}

def suma3(X: List[Any]): List[Any] = {
  for (x <- X) yield x.toString.toDouble + 3
}

def suma1(X: Any): Any = {
  X.toString.toDouble + 1
}

def suma2(X: Any): Any = {
  X.toString.toDouble + 2
}

def suma3(X: Any): Any = {
  X.toString.toDouble + 3
}


println(miFuncion2(List(suma1,suma2,suma3),List(1,2,3)))
println(miFuncion(List(suma1,suma2,suma3),List(1,2,3)))

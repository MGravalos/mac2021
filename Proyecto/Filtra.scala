//Saca de una lista X los elementos que cumplan F
def filtra(F: (Any) => Boolean, X: List[Any]): List[Any]={
  if(X.size > 0)
    if(F(X(0)))
      X(0) :: filtra(F,X.drop(1))
    else
      filtra(F,X.drop(1))
  else
    Nil
}

def palindromo(X: Any): Boolean = {
  if(X.toString.reverse == X.toString)
    true
  else
    false
}

println(filtra(palindromo, List("aabb","abba","acba")))
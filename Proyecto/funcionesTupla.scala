//Funcion tupla para números
def funcionTuplaNum(F1: (Double) => Double, F2: (Double) => Double, X: Double): Double ={
  F1(X) + F2(X)
}

//Funcion tupla para booleanas
def funcionTuplaBool(F1: (Any) => Boolean, F2: (Any) => Boolean, X: Any): Boolean = {
  F1(X) || F2(X)
}

def mayorQue2(X: Any): Boolean = {
  X match {
    case d: Double => X.toString.toDouble > 2
    case s: String => X.toString.size > 2
  }
}

def palindromo(X: Any): Boolean = {
  var cad = X.toString
  if( cad != cad.reverse) false
  else true
}

def incrementa(X: Double): Double = {
  X+1
}

def predecesor(X: Double): Double = {
  X-1
}

println(funcionTuplaNum(incrementa,predecesor,5))
println(funcionTuplaBool(palindromo,mayorQue2,("aa")))
println(funcionTuplaBool(palindromo,mayorQue2,("ab")))
println(funcionTuplaBool(palindromo,mayorQue2,("aab")))
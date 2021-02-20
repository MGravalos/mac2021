//Funcion calcula hash implementada por Ricardo en clases
def calcula_Hash(X: List[Int]): Int={
  var sol = 0
  if(X.size > 0){
    var listaPrimos = creaPrimos(X.size)
    println(listaPrimos)
    for( i <- 0 to X.size-1){
      sol += X(i) * listaPrimos(i)
    }
  }
  else
    sol = -1
  sol
}

def divisores(X: Int): List[Int]= {
 for (i <- List.range(1,X+1) if(X%i) == 0)
    yield i
 
}

def primo(X: Int): Boolean ={
  if(divisores(X).size == 2) true
  else false
}


def creaPrimos(X: Int): List[Int] = {
  var contador = 1
  var sol: List[Int] = List()
  while(sol.size < X){
    if(primo(contador))
      sol ::= contador
    contador += 1
  }
  sol
  
}


println(calcula_Hash(List(1,2,3,4)))
def divisores(X: Int): List[Int]= {
 for (i <- List.range(1,X+1) if(X%i) == 0)
    yield i
 
}

def primo(X: Int): Boolean ={
  if(divisores(X).size == 2) true
  else false
}

//Devolvemos la lista de números menores o iguales que X que son primos
def calculaPrimos(X: Int): List[Int] = {
  for (i <- List.range(1,X+1) if primo(i))
    yield i
}


println(calculaPrimos(10))
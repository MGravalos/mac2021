//Creamos una lista con los nº multiplos de 3 o 5 menores o iguales que X
def creaListaMultiplos3o5(X: Int): List[Int] = {
  for (i <- List.range(1,X+1) if (i % 3 == 0 || i % 5 == 0))
    yield i
}

//Calculamos la suma de los numeros menores o iguales que X que sean multiplos de 3 o 5
def calculaSumatorioMultiplos3o5 (X: Int): Int = {
  creaListaMultiplos3o5(X).sum
}

println(calculaSumatorioMultiplos3o5(15))
def divisores(X: Int): List[Int]= {
 for (i <- List.range(1,X+1) if(X%i) == 0)
    yield i
 
}

def primo(X: Int): Boolean ={
  if(divisores(X).size == 2) true
  else false
}

println(primo(5))
println(primo(4))
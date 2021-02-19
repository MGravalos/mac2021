def divisores(X: Int): List[Int]= {
 for (i <- List.range(1,X+1) if(X%i) == 0)
    yield i
 
}

println(divisores(5))
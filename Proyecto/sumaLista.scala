def sumaLista(t: List[Int]): Int = {
  if(t.isEmpty){
    0
  }else{
    t(0)+ sumaLista(t.drop(1))
  }
}

var x = List(5)
println(sumaLista(x))

var y = List(1,2,3,4,5)
println(sumaLista(y))
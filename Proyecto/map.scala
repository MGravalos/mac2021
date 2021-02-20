//Funcion map
def map(F: (Any) => Any, X: List[Any]): List[Any] = {
  if(X.size > 0){
    F(X(0)) :: map(F,X.drop(1))
  }else
    Nil
}

//Funcion que acepta cualquier tipo. Si es numerico, calcula su cuadrado. Si es String, la invierte
def funcion(X: Any): Any = {
  X match{
    case d: Double =>  X.toString.toDouble * X.toString.toDouble
    case s: String => X.toString.reverse
  }
}


println(map(funcion,List(1,2,3)))

println(map(funcion,List("Casa","Pepe","Hola")))

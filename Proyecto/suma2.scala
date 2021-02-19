//Suma de dos nº independientes de los tipos de datos
def suma2[T](X: T, Y: T)(implicit num: Numeric[T]): T = {
  import num._
  X + Y
}


println(suma2(1,2.5))
println(suma2(1,2))
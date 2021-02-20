//Funciones suma vistas en haskell
def suma(X: Double, Y: Double): Double = {
  X + Y
}

def suma3(X: Double, Y: Double, Z: Double): Double = {
  X + Y + Z
}

def suma3(X: Double, Y: Double): Double ={
  X + Y + 1
}

def suma3(X: Double): Double = {
  X + 1 + 2
}

println(suma(1,2))
println(suma3(1,2,3))
println(suma3(1,2))
println(suma3(3))
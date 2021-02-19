//Aproximacion de la integral
def calculaIntegral(F: Double => Double, A: Double, B: Double, T: Double): Double = {
  if(B <= A)
    0
  else if((A - B) > T){
    F(A) * (B - A)
  }else{
    F(A) * T + calculaIntegral(F,A+T,B,T)
  }
}

def funcion(X: Double): Double = {
  X * X
}

println(calculaIntegral(funcion,0,2,0.5))
println(calculaIntegral(funcion,0,2,0.25))
println(calculaIntegral(funcion,0,2,0.1))
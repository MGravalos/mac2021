//Aproximacion al valor de pi
def aproximacionPi(t: Double): Double = {
  var x = (-1+t/2 to 1-t/2 by t).toList
  var y = (-1+t/2 to 1-t/2 by t).toList
  var sol = 0.0;
  for( xi <- x){
    for( yi <- y){
      if(Math.sqrt(xi*xi + yi*yi) <= 1){
        sol += t*t
      }
    }
  }
  sol
}

println(aproximacionPi(0.5))
println(aproximacionPi(0.1))
println(aproximacionPi(0.01))
println(aproximacionPi(0.001))
println(aproximacionPi(0.0001))
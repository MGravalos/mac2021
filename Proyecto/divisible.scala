def divisible(x: Double , y: Double): Boolean = {
  val resto = x % y
  resto == 0
}

println(divisible(5,1))
println(divisible(10,3))
println(divisible(10,5))

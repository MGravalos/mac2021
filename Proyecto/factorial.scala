def factorial(x: Double): Double = {
  if (x <= 0) 1
  else x * factorial(x-1)
}

println(factorial(5))


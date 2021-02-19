def aproxima_pi(Doube t): Double = {
    t = sum[t*t |x <- [-1 + t/2, -1 + 3*t/2..1-t/2], y <- [-1 + t/2, -1 + 3*t/2..1-t/2], sqrt(x^2 + y^2) <= 1]
}
println(aproxima_pi)
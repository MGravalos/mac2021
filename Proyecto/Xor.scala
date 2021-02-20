//Xor implementada en Scala
def miXor(A: Boolean, B: Boolean): Boolean = {
  if((A || B) && !(A && B))
    true
  else
    false
}

println(miXor(true,false))
println(miXor(true,true))
println(miXor(false,false))
println(miXor(false,true))
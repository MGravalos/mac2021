//Eliminacion de espacios en blancos de una lista de caracteres
//Ampliacion del ejemplo de clase consistente en eliminar solo un hueco al principio del array
def quitaBlancos(cad: List[Char]): List[Char] = {
  if(cad.isEmpty){
    List()
  }else{
    if(cad(0) == ' '){
      cad.drop(1)
      quitaBlancos(cad.drop(1))
    }
    else{
      List(cad(0)) ::: quitaBlancos(cad.drop(1))
    }
  }
}


var cad: List[Char] = List('C',' ','A','D')
println(cad(0) == ' ')
println(quitaBlancos(cad))
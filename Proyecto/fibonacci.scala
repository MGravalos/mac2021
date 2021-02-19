def fibonaccirec(x: Int): Int = {
  if(x == 1){
    1
  }else{
    if(x == 2){
      2
    }else{
      fibonaccirec(x-1) + fibonaccirec(x-2)
    }
  }
}


println(fibonaccirec(10))
def traduce(t: Int): Char = {
  t match{
    case 1 => 'A'
    case 2 => 'B'
    case 3 => 'C'
  }
}

println(traduce(1))
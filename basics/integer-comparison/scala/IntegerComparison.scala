object IntegerComparison {
  def main(args: Array[String]) {
    val i1 = args(0).toInt
    val i2 = args(1).toInt
    if (i1 < i2) println(s"$i1 is less than $i2.")
    else if (i1 == i2) println(s"$i1 is equal to $i2.")
    else if (i1 > i2) println(s"$i1 is greater than $i2.")
  }
}
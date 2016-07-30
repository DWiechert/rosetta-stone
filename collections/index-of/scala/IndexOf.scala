object IndexOf {
  def main(args: Array[String]) {
    val elementFound = 3
    val elementNotFound = 5
    val list = List(1, 2, 3, 4)
    println(indexOf(list, elementNotFound))
    println(indexOf(list, elementFound))
  }

  def indexOf(list: List[Int], element: Int): Int = {
    def indexOfWithIndex(list: List[Int], element: Int, index: Integer): Int = list match {
      case Nil                             => -1
      case head :: Nil                     => -1
      case head :: tail if head == element => index
      case head :: tail                    => indexOfWithIndex(tail, element, index + 1)
    }

    indexOfWithIndex(list, element, 0)
  }
}
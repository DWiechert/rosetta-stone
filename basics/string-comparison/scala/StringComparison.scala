object StringComparison {
  def main(args: Array[String]) {
    val s1 = args(0)
    val s2 = args(1)
    if (s1.equals(s2)) println(s"'$s1' is equal to '$s2' with case.")
    if (s1.equalsIgnoreCase(s2)) println(s"'$s1' is equal to '$s2' without case.")
    val order = s1.compareTo(s2)
    if (order < 0) println(s"'$s1' is lexically before '$s2'.")
    if (order == 0) println(s"'$s1' is lexically equal to '$s2'.")
    if (order > 0) println(s"'$s1' is lexically after '$s2'.")
  }
}
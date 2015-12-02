object CommandLineArguments {
  def main(args: Array[String]) {
    val size = args.length
    println(s"$size arguments were provided:")
    args.foreach(println(_))
  }
}
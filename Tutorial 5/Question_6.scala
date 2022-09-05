object Question_6 {
  def main(args: Array[String]): Unit = {
    fiboSeq(10)
  }
  def fibonacci(n: Int): Int = n match {
    case x if x == 0 => 0
    case x if x == 1 => 1
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }

  def fiboSeq(n: Int): Unit = {
    if (n > 0) fiboSeq(n - 1)
    println(fibonacci(n))
  }


}

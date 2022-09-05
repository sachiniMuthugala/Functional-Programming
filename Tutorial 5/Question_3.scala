object Question_3 {

  def main(args: Array[String]): Unit = {
    println(sum(5))
  }

  def sum(n: Int): Int = n match {
    case 1 => return 1
    case _ => return n + sum(n - 1)
  }


}

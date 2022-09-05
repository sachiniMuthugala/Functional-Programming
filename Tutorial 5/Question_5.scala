object Question_5 {

  def main(args: Array[String]): Unit = {
    println(evenSum(5))
  }

  def evenSum(n:Int):Int={
    if (n == 0)
      return 0
    if (n % 2 != 0)
      return evenSum(n - 1)
    else
      return n + evenSum(n - 1)
  }

}

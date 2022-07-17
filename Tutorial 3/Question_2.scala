object Question_2 {

  def converter(c : Double) : Double = c * 1.8 + 32.00

  def main(args: Array[String]): Unit = {
    printf("35 C --> %.2f F", converter(35))
  }

}

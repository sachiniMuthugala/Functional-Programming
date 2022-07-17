object Question_5 {

  def easy(x : Int) : Int = x * 8;

  def tempo(x : Int) : Int = x * 7;

  def total(e : Int, t : Int) : Int = easy(e) + tempo(t)

  def main(args: Array[String]): Unit = {
    printf("Total Running time : %d", total(4,3))
  }

}

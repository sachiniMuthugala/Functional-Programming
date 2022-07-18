object Question_5 {

  def easy(x : Int) : Double = x * 8;

  def tempo(x : Int) : Double = x * 7;

  def total(e : Int, t : Int) : Double = easy(e) + tempo(t);

  def main(args: Array[String]): Unit = {
    printf("Total Running time : %f", total(4,3));
  }

}

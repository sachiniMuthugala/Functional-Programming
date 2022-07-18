object Question_1 {
  def area (radius : Double) : Double = Math.PI * radius * radius;

  def main(args: Array[String]) : Unit = {
    printf("Area : %f", area(5));

  }
}

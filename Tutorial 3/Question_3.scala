object Question_3 {

  def volume(radius : Double) : Double = ( 4 * Math.PI * Math.pow(radius,3)) / 3;

  def main(args: Array[String]): Unit = {
    printf("Volume of the sphere : %f", volume(5));

  }

}

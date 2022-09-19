import com.sun.tools.internal.xjc.reader.Ring.add

import scala.math.{pow, sqrt}

case class Point(a: Int, b: Int) {
  def x: Int = a

  def y: Int = b

  def +(point: Point) = Point(this.x + point.x, this.y + point.y)

  def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy)

  def distance(p1: Point): Double = {
    val y2: Double = pow(p1.y - this.y, 2);
    val x2: Double = pow(p1.x - this.x, 2);
    return sqrt(y2 + x2);
  }

  def switch() = Point(this.y, this.x)


}

object CaseClass {

  def main(args: Array[String]): Unit = {

    val p1 = Point(1,3)
    val p2 = Point(2,4)


    println(p1 + " + " + p2 + " = " + p1.+(p2))

    println("After moving " + p1 + " by (1,2) = " + p1.move(1,2))

    println("Distance between " + p1 + " and " + p2 + " = " + p1.distance(p2))

    println("Switch " + p1 + " = " + p1.switch())
  }








}

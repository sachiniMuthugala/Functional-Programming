import scala.io.StdIn.readInt

object Question_2 {
  def main(args: Array[String]): Unit = {
    print("Enter the input : ")
    val input = readInt();

    print(checker(input))
  }

  def checker(x : Int) : String = x match {
    case x if (x <= 0) => "Negative/Zero Input"
    case x if (x % 2 == 0) => "Even Number is given"
    case _ => "Odd number is given"
  }

}

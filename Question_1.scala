import scala.io.StdIn.readDouble

object Question_1 {

  def main(args: Array[String]): Unit = {
    print("Enter the deposit Amount: ")
    var deposit = readDouble()
    printf("Interest for %.2f is : %.2f",deposit,interest(deposit))
  }

  def interest(x : Double) : Double = {
    if(x < 20000){
      x * 0.02
    }else if(x < 200000){
      x * 0.04
    }else if (x < 20000000){
      x * 0.035
    }else{
      x * 0.065
    }
  }

}

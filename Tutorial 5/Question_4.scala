object Question_4 {

  def main(args: Array[String]): Unit = {
    if(isEven(25)){
      println("Even");
    }
    else{
      println("ODD");
    }
  }
  // mutual recursion
  def isEven(n:Int):Boolean= n match{
    case 0 => true
    case _ => isOdd(n-1)
  }

  def isOdd(n:Int):Boolean= !(isEven(n))

}

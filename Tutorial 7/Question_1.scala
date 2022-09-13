// Rational class
class Ration(x:Int,y:Int) {
  var numer=x;
  var denom=y;

  def neg()= new Ration(-numer,denom);
}

object Question_1 {
  def main(args: Array[String]) {
    val x:Ration=new Ration(3,4);
    //1. neg
    var r:Ration=x.neg;
    println(r.numer+"/"+r.denom);


  }
}

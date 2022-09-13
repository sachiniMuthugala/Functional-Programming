// class to define an account
class Acc(id:String,n: Int, b: Double) {
  val nic:String=id;
  val acnumber:Int=n;
  var balance:Double=b;

  def transfer(acc:Acc,amount:Double)= {
    this.balance=this.balance-amount;
    acc.balance=acc.balance+amount;
  }

}

object Question_3{
  def main(args: Array[String]) {

    val a:Acc=new Acc("19998591227",10012,10000.00);
    val b:Acc=new Acc("19996754321",10023,12000.00);

    a.transfer(b,2000.00);

    println("Balance of b after transferred :"+b.balance);
    println("Balance of a after transferred :"+a.balance);


  }
}

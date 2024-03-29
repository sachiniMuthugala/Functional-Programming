class Account(id: String, n: Int, b: Double) {
  val nic: String = id
  val accNum: Int = n
  var balance: Double = b

  // overriding toString function to call account data type
  override def toString = "[" + nic + ":" + accNum + ":" + balance + "]"
}

object Question_4{

  def main(args: Array[String]) {

      //List of accounts
      val a:Account=new Account("19998591227",10012,-500.00);
      val b:Account=new Account("19996754321",10023,-1200.00);
      var bank:List[Account]=List(a,b);

      //overdraft acc
      val overdraft = bank.filter(x=>x.balance<0)
      println("Over Draft Accounts : "+overdraft);


      // Sum
      var total = bank.map(x=>x.balance).reduce((x,y) => x+y)
      println("Total Balance = " +total)

      //interest
      bank.map(x=> if(x.balance>0) x.balance=x.balance*1.05 else x.balance=x.balance*1.1)
      println("With Interest :"+bank);

    }


}

object Question_1 {

  def isPrime(n:Int,i:Int=2):Boolean={
    if(n<=2){
      if(n==2){ return true;}
      else {
        return false
      };}

    if(n%i==0){
      return false;

    }
    if(i*i>n)
      return true;

    return isPrime(n,i+1)

  }

  if(isPrime(11)){
    println("Prime");
  }
  else{
    println("Not a prime!")
  }

  def main(args: Array[String]): Unit = {
    isPrime(5)
  }

}

object Question_2 {

  def main(args: Array[String]): Unit = {
    primeSeq(10);
  }

  def isPrime(n: Int, i: Int = 2): Boolean = {
    if (n <= 2) {
      if (n == 2) {
        return true;
      }
      else {
        return false
      };
    }

    if (n % i == 0) {
      return false;

    }
    if (i * i > n)
      return true;

    return isPrime(n, i + 1)

  }

  def primeSeq(n: Int): Unit = {
    if (n > 1) {
      primeSeq(n - 1);
      if (isPrime(n)) println(n);
    }
  }



}

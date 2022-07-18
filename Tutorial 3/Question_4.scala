object Question_4 {
  def bookPrice(x : Int) : Double = x * 24.95

  def discount(price : Double) : Double = price * 0.4

  def shipping(x : Int) : Double = {
    if(x <= 50){
      x * 3
    }else{
      50 * 3 + (x-50) * 0.75
    }
  }

  def total(amount : Int) = bookPrice(amount) - discount(bookPrice(amount)) + shipping(amount);

  def main(args: Array[String]): Unit = {
    printf("Total Cost for 60 books : %.2f", total(60));
  }

}

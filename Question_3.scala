object Question_3 {
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")(toUpper))
    println(formatNames("NIroshan")(toLower))
    println(formatNames("saman")(toUpper))
    println(formatNames("KumarA")(toLower))
  }

  def toUpper(u : String) : String = {
    u.toUpperCase
  }

  def toLower(l : String) : String = {
    l.toLowerCase
  }

  def formatNames(name : String)(func: String => String) : String = {
    func(name)
  }
}
